package com.jonas.scanner;

import java.util.Objects;
import java.util.Scanner;
import com.jonas.scanner.Test;
public class Main {
    public static void main(String[] args) {
        //Objects
        Test test = new Test();
        Student benny = new Student();

        test.scannerTwo();
        // Game
        do {

            System.out.println("Input bennys age");
            int result = sc.nextInt();

            benny.age = result;

            System.out.println("You picked: " + result);
            System.out.println("Bennys age is: " + benny.age);

        } while (true);



    }
}
