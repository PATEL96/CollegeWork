// SPDX-License-Identifier: MIT
pragma solidity ^0.8.20;

import "@openzeppelin/contracts/utils/structs/EnumerableSet.sol";

contract RajDPatel8A {
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

    // Store all bikes with their IDs
    mapping(uint256 => Bike) private bikes;
    EnumerableSet.UintSet private bikeIds;
    uint256 private nextBikeId;

    // Mapping to keep track of which rider has booked which bike
    mapping(address => uint256) private riderToBike;

    // Create a new bike and add it to the system
    function createBike(uint256 _speed, uint256 _riderRating) external {
        uint256 bikeId = nextBikeId++;
        bikes[bikeId] = Bike({
            id: bikeId,
            speed: _speed,
            status: BookingStatus.AVAILABLE,
            riderRating: _riderRating,
            currentRider: address(0)
        });
        bikeIds.add(bikeId); // Add the bike ID to the set
    }

    // Get details of all available bikes
    function getAllBikes() external view returns (Bike[] memory) {
        uint256 length = bikeIds.length();
        Bike[] memory allBikes = new Bike[](length);
        for (uint256 i = 0; i < length; i++) {
            uint256 bikeId = bikeIds.at(i);
            allBikes[i] = bikes[bikeId];
        }
        return allBikes;
    }

    // Book a bike by ID
    function bookBike(uint256 bikeId) external {
        require(bikes[bikeId].status == BookingStatus.AVAILABLE, "Bike is not available");
        require(riderToBike[msg.sender] == 0, "You have already booked a bike");

        bikes[bikeId].status = BookingStatus.BOOKED;
        bikes[bikeId].currentRider = msg.sender;
        riderToBike[msg.sender] = bikeId + 1;
    }

    // Return a booked bike
    function returnBike(uint256 _riderRating) external {
        uint256 bikeId = riderToBike[msg.sender] - 1;
        require(bikeId >= 0, "You have not booked any bike");
        require(bikes[bikeId].currentRider == msg.sender, "You are not the rider");

        bikes[bikeId].status = BookingStatus.AVAILABLE;
        bikes[bikeId].riderRating = _riderRating;
        bikes[bikeId].currentRider = address(0);
        riderToBike[msg.sender] = 0;
    }

    // Check bike status by ID
    function checkBikeStatus(uint256 bikeId) external view returns (BookingStatus) {
        return bikes[bikeId].status;
    }
}
