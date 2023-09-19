package com.jonas.scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isPlaying = true;

        do {
            int result = scannerNumber();

            for (int i = 0; i < result; i++) {
                System.out.println(i);
                System.out.println("LOOPING...");

            }

        } while (isPlaying);


        /*
        System.out.println("App is running");

        scanner();

        Test.scannerTwo();

        String text = "Hej";
        */
    }

    public static String scannerText(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert some sentence");
        String input = sc.nextLine();

        return input;
    }

    public static int scannerNumber(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert number");

        return sc.nextInt();
    }
}
