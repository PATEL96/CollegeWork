// SPDX-License-Identifier: MIT
pragma solidity ^0.8.20;

import "@openzeppelin/contracts/utils/structs/EnumerableSet.sol";

contract RajDPatel8B {
    using EnumerableSet for EnumerableSet.UintSet;

    enum BookingStatus {
        AVAILABLE,
        BOOKED,
        NOT_IN_SERVICE
    }

    struct Bike {
        uint256 id;
        uint256 speed; // in KMPH
        BookingStatus status;
        uint256 riderRating; // Out of 10
        address currentRider;
    }

    mapping(uint256 => Bike) private bikes;
    EnumerableSet.UintSet private bikeIds;
    uint256 private nextBikeId;
    mapping(address => uint256) private riderToBike;

    // Modifier to ensure the bike is available
    modifier onlyAvailable(uint256 bikeId) {
        require(bikes[bikeId].status == BookingStatus.AVAILABLE, "Bike is not available");
        _;
    }

    // Modifier to check if the caller has booked a bike
    modifier onlyIfBooked() {
        require(riderToBike[msg.sender] > 0, "You have not booked any bike");
        _;
    }

    // Modifier to check if the caller is the current rider
    modifier onlyCurrentRider(uint256 bikeId) {
        require(bikes[bikeId].currentRider == msg.sender, "You are not the current rider of this bike");
        _;
    }

    function createBike(uint256 _speed, uint256 _riderRating) external {
        uint256 bikeId = nextBikeId++;
        bikes[bikeId] = Bike({
            id: bikeId,
            speed: _speed,
            status: BookingStatus.AVAILABLE,
            riderRating: _riderRating,
            currentRider: address(0)
        });
        bikeIds.add(bikeId);
    }

    function getAllBikes() external view returns (Bike[] memory) {
        uint256 length = bikeIds.length();
        Bike[] memory allBikes = new Bike[](length);
        for (uint256 i = 0; i < length; i++) {
            uint256 bikeId = bikeIds.at(i);
            allBikes[i] = bikes[bikeId];
        }
        return allBikes;
    }

    // Book a bike if available
    function bookBike(uint256 bikeId) external onlyAvailable(bikeId) {
        require(riderToBike[msg.sender] == 0, "You already have a bike booked");

        bikes[bikeId].status = BookingStatus.BOOKED;
        bikes[bikeId].currentRider = msg.sender;
        riderToBike[msg.sender] = bikeId + 1;
    }

    // Return a bike
    function returnBike(uint256 _riderRating) external onlyIfBooked {
        uint256 bikeId = riderToBike[msg.sender] - 1;
        require(bikeId >= 0, "Invalid bike ID");

        _returnBike(bikeId, _riderRating);
    }

    // Internal function to return bike and reset data
    function _returnBike(uint256 bikeId, uint256 _riderRating) internal onlyCurrentRider(bikeId) {
        bikes[bikeId].status = BookingStatus.AVAILABLE;
        bikes[bikeId].riderRating = _riderRating;
        bikes[bikeId].currentRider = address(0);
        riderToBike[msg.sender] = 0;
    }

    // Check status of a specific bike
    function checkBikeStatus(uint256 bikeId) external view returns (BookingStatus) {
        return bikes[bikeId].status;
    }
}
