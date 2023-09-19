package com.jonas.demo;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // Uppgift 0
        Scanner sc = new Scanner(System.in);

        // uppgift 1
        UserInput scan = new UserInput();
        scan.playerName();

        // uppgift 2
        int x = scan.number();
        iterateNum(x);

        // uppgift 3,4,5
        infinityDoWhile();


        //uppgift 6
        System.out.println(scan.number());


    }

    public static void iterateNum(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

    public static void infinityDoWhile() {
        UserInput sc = new UserInput();
        boolean itsOnLikeDonkeyKong = true;
        do {

            String name = sc.playerName();
            switch (name) {
                case "Stop":
                    itsOnLikeDonkeyKong = false;
                    break;
                case "1":
                    System.out.println("Throwing!");
                    break;
                default:
                    System.out.println("Wrong Input!");
                    break;
            }

        } while (itsOnLikeDonkeyKong);
    }

}
