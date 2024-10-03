// SPDX-License-Identifier: MIT
pragma solidity ^0.8.20;

// To write, deploy, and execute a smart
// contract that performs simple
// mathematical operations of three
// operands, and makes use of view
// functions in Solidity.

contract RajDPatel4 {
    uint256 a;
    uint256 b;
    uint256 c;

    constructor(
        uint256 _a,
        uint256 _b,
        uint256 _c
    ) {
        a = _a;
        b = _b;
        c = _c;
    }

    // getter function to get all values.
    function raj_getVals()
    external
    view
    returns (
        uint256,
        uint256,
        uint256
    )
    {
        return (a, b, c);
    }

    // setter function to set values
    function raj_setVals(
        uint256 x,
        uint256 y,
        uint256 z
    ) external {
        a = x;
        b = y;
        c = z;
    }

    // Addition function
    function raj_Add() external view returns (uint256) {
        return a + b + c;
    }

    // Subtraction function
    function raj_Sub() external view returns (uint256) {
        return a - b - c;
    }

    // Multiplication function
    function raj_Mul() external view returns (uint256) {
        return a * b * c;
    }

    // Division function
    function raj_Div() external view returns (uint256) {
        uint256 ans;
        if (b <= 0) {
            ans = 0;
            return ans;
        }
        if (c <= 0) {
            ans = 0;
            return ans;
        }
        ans = (a / b) / c;
        return ans;
    }
}
