package com.jonas.demo;

import java.util.Scanner;

public class UserInput {
    Scanner sc = new Scanner(System.in);
    char p = 'A';
    String name;

    public String playerName(){

        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Player " + p + ": " + name);
        p++;
        return name;
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


