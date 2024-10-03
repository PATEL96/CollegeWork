// SPDX-License-Identifier: MIT
pragma solidity ^0.8.20;

contract RajDPatel5 {
    uint256 private raj_a;
    uint256 private raj_b;
    uint256 private raj_c;

    // constructor to initiate contract state
    constructor(uint256 a, uint256 b, uint256 c) {
        raj_a = a;
        raj_b = b;
        raj_c = c;
    }

    // function to set state variables
    function raj_setVals(uint256 a, uint256 b, uint256 c) external {
        raj_a = a;
        raj_b = b;
        raj_c = c;
    }

    // function to execute conditional statements (If--ElseIf--Else)
    function raj_ifElse() external view returns (uint256) {
        uint256 tmp;

        if(raj_a == 1){
            tmp = raj_a;
        } else if(raj_b == 2){
            tmp = raj_b;
        } else if(raj_c == 3){
            tmp = raj_c;
        } else {
            tmp = 0;
        }

        return tmp;
    }

    // function to execute conditional statements (If--ElseIf--Else) using ternary operator
    function raj_ternaryIfElse() external view returns(uint256) {
        uint256 tmp;

        raj_a == 1 ? tmp = raj_a : (raj_b == 2 ? tmp = raj_b: (raj_c == 3 ? tmp = raj_c: tmp = 0));

        return tmp;
    }

    // function to execute nested If Statement
    function raj_nestedIf() external view returns (uint256) {
        uint256 tmp;

        if(raj_a == 1){
            tmp = raj_a;
            if(raj_b == 2){
                tmp = raj_b;
                if(raj_c == 3) {
                    tmp = raj_c;
                }
            }
        } else {
            tmp = 0;
        }

        return tmp;
    }

    // function to execute nested If Statement using ternanry operator
    function raj_nestedTernaryIf() external view returns (uint256) {
        uint256 tmp;

        return raj_a == 1 ? (raj_b == 2 ? (raj_c == 3 ? tmp = 3: tmp = 2): tmp =1): tmp = 0;
    }
}