// SPDX-License-Identifier: MIT
pragma solidity ^0.8.20;

contract RajDPatel6 {
    uint256 private raj_forSum;
    uint256 private raj_whileSum;

    // constructor to initiate state variables
    constructor() {
        raj_forSum = 0;
        raj_whileSum = 0;
    }

    // Private function to return sum using While Loop
    function raj_WhileLoop(uint256 _value) private pure returns (uint256) {
        uint256 tmp = 0;
        uint256 i = 0;

        while (i <= _value) {
            tmp += 1;
            i++;
        }

        return tmp;
    }

    // Private function to return sum using For Loop
    function raj_ForLoop(uint256 _value) private pure returns (uint256) {
        uint256 tmp = 0;

        for (uint256 i = 0; i <= _value; i++) {
            tmp += 1;
        }

        return tmp;
    }

    // function to set sum in state variable
    function raj_setSum(uint256 _value) external {
        raj_forSum = raj_ForLoop(_value);
        raj_whileSum = raj_WhileLoop(_value);
    }

    // function to view sum in state variable
    function raj_getSums() external view returns (uint256, uint256) {
        return (raj_forSum, raj_whileSum);
    }
}
