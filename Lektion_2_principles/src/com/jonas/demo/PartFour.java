package com.jonas.demo;

/*TODO
*   Continuing from part 3...
    Check if index is 10    →   print out “index is 10”
*              Otherwise    →   print out “index is not 10”*/
public class PartFour {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {

            if (i == 10) {
                System.out.println("index is 10");
            } else {
                System.out.println("index is not 10");
            }
        }
    }
}
