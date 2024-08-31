// SPDX-License-Identifier: MIT
pragma solidity ^0.8.20;

// To write, deploy, and execute a smart
// contract that consists of state variables,
// local variables, constructor and
// public/external function in Solidity.

contract RajDPatel3 {
    // this are the State variables of the contact that are stored on the contract forever
    string public Name;
    uint8 public Age;
    bool public isStudent;

    // constructor is a predefined function in solidity that is automatically called on deployment of the contract
    // it is also used to give some initial values or state to the contract
    constructor() {
        Name = "PATEL96";
        Age = 18;
        isStudent = false;
    }

    // public call is used for implying the access type of this function
    function raj_Public_call(
        string memory _Name,
        uint8 _Age,
        bool _isStudent
    ) public {
        Name = _Name;
        Age = _Age;
        isStudent = _isStudent;
    }

    // external call is used for implying the access type of this function
    function raj_External_call(
        string memory _Name,
        uint8 _Age,
        bool _isStudent
    ) external {
        Name = _Name;
        Age = _Age;
        isStudent = _isStudent;
    }

    // NOTE: using `memory` in the functions defines the state change of the string.
    //      as the length and size of the string variable can vary from call to call
    //      so the method `memory` helps the solidity compiler to update the storage space of that variable accordingly.
}
