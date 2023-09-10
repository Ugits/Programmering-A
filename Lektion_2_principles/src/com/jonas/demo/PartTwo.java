package com.jonas.demo;

/*TODO
*   Continuing from part 1..
    If the statement is NOT truthy.. Print out “Adult”*/
public class PartTwo {

    public static void main(String[] args) {

        int age = 22;
        if (age < 18) {
            System.out.println("Underage");
        } else {
            System.out.println("Adult");
        }
    }
}
