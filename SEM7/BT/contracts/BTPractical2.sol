// SPDX-License-Identifier: MIT
pragma solidity ^0.8.20;

// To write, deploy, and execute a basic
// smart contract that makes use of
// different data types in Solidity.

contract RajDPatel2 {

    // unsigned integers uint8 - uint256. only writing uint == uint256
    uint8 raj_1 = 255;
    uint16 public raj_2 = 65535;
    uint32 public raj_3 = 4294967295;

    // signed integers int8 - int256
    int public raj_4 = 127;
    int public raj_5 = - 128;

    // Finding minimum and maximum values of a int/uint datatype
    uint256 public raj_6 = type(uint256).max;
    uint256 public raj_7 = type(uint256).min;

    int256 public raj_8 = type(int256).max;
    int256 public raj_9 = type(int256).min;

    // Boolean
    bool public raj_10 = false;

    // Strings
    string public raj_11 = "PATEL96";

    // Solidity specific dataTypes that are useful in smart contract development.

    //Address
    // to store the address of any wallet or any contract this data type in used.
    // It is a string of 40 hexadecimal values.
    address public raj_12 = 0x039CA860A762dDDB916eE16e6dA23630A39F224A; // My official Wallet address :P

    // bytes(1-32)
    bytes1 public raj_13 = 0xff;

    // keccak256 generates a value os 32 bytes using the input seed
    // same input seed will always generate same bytes of data.
    bytes32 public raj_14 = keccak256("Raj D. Patel");

    // Arrays
    uint256[] public raj_15 = [1, 2, 3, 4, 5, 6, 7, 8, 9];
}