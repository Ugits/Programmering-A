package com.jonas.demo;

import java.util.Scanner;

public class UserInput {
    Scanner sc = new Scanner(System.in);



    public void playerName(){
        System.out.println("Enter your name");
        System.out.println("Player #1: " + sc.nextLine());
    }

    public int number(){
        System.out.println("Enter a number");
        while (!sc.hasNextInt()) {
            System.out.println("thats not a number, try again");
            sc.next();
        }

        return sc.nextInt();
    }


}


