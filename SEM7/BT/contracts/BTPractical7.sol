// SPDX-License-Identifier: MIT
pragma solidity ^0.8.20;

contract RajDPatel7 {
    uint[] private raj_array;

    constructor() {
        raj_array = [0,0,0,0];
    }

    // return s the complete state variable of array
    function raj_getArray() external view returns (uint[] memory){
        return raj_array;
    }

    // retruns the length of the array
    function raj_getLength() external view returns (uint) {
        return raj_array.length;
    }

    // Remove a particluar value from the Array using its index.
    function raj_setElement(uint256 _index, uint256 _value) external {
        if(_index >= 0 && _index < raj_array.length) {
            raj_array[_index] = _value;
        }
    }

    // Add new Element at last of the array
    function raj_inertElement(uint256 _value) external {
        raj_array.push(_value);
    }

    // Remove last element of the Array
    function raj_removeLastElement() external {
        raj_array.pop();
    }

    // Replace current Array wih a New Array
    function raj_SetNewArray(uint256[] memory _newArray) external {
        raj_array = _newArray;
    }

    // Delete an Element using its Index
    function raj_deleteElement(uint256 _index) external {
        if(_index >= 0 && _index < raj_array.length) {
            delete raj_array[_index];
        }
    }

    // Completely removing the element from the Array.
    function raj_removeElement(uint256 _index) external {
        if(_index >= 0 && _index < raj_array.length) {
            for (uint256 i = _index -1; i < raj_array.length; i++){
                raj_array[i] = raj_array[i+1];
            }
            raj_array.pop();
        }
    }
}