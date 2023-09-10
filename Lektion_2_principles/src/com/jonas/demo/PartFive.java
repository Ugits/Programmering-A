package com.jonas.demo;

/*TODO
*   Create a variable of type String and name it ‘Anton’
    Create a Switch with three cases as follows:
    Case “Benny”:
    Case “Anton”:
    Default:  */
public class PartFive {

    public static void main(String[] args) {

        String name = "Anton";
        switch (name) {
            case "Benny":
                System.out.println("Benny is the Winner!");
                break;
            case "Anton":
                System.out.println("Anton is the Winner!");
                break;
            default:
                break;
        }
    }
}
