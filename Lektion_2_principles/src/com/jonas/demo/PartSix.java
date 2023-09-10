package com.jonas.demo;

/*TODO
 *   Create a method for your if-statement,
 *   for-loop and switch.
 *   And then call them from Main.*/
public class PartSix {

    public static void main(String[] args) {
        //variables
        String name = "Anton";
        int age = 22;

        ifSats(age);
        forLoop();
        swiitch(name);
    }

    // if-Sats Method
    public static void ifSats(int age) {

        if (age < 18) {
            System.out.println("Underage");
        } else {
            System.out.println("Adult");
        }
    }

    // for-loop Method
    public static void forLoop() {
        for (int i = 1; i < 11; i++) {

            if (i == 10) {
                System.out.println("index is 10");
            } else {
                System.out.println("index is not 10");
            }
        }
    }

    // switch Method
    public static void swiitch(String name) {

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
