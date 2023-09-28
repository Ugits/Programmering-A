package com.jonas.felhanteringochproblemlosning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int[] numbers = {0, 100, 1000, 2000};


        System.out.println("before crash");

        try{
            //try to execute code
            System.out.println("inside try");
            System.out.println(2/0);
        } catch (Exception error) {
            //catch error if it FAILS
            System.out.println("inside catch");
            error.printStackTrace();
        }

        //


        System.out.println("after crash");




        /**
         *
         int test;

         System.out.println(test);
         Scanner scanner = new Scanner(System.in);
         System.out.println("Type something to crash the program");
         scanner.nextLine();

         for (int i = 0; i < numbers.length; i++) {
             System.out.println(numbers[i]);
         }
         */



    }

}

