package com.jonas.demo;
/*TODO
*   What happens if you create an array that contains:
    Integers and Booleans inside separate indexes of the same array?*/

public class PartSeven {

    public static void main(String[] args) {

        int[] intBool = {4, 5, true, false, 7, 0};

        // Error: java: incompatible types: boolean cannot be converted to int
        // An array in Java cannot store more than one kind of data type.


        //TODO Extra Research

        // However, there is a good way to store several kind of data and attributes.
        // By building a separate class with this information,
        // you can make an object of this class, aka instantiate the class.
    }
}
