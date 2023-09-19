package com.jonas.demo;

import java.util.Scanner;

public class UserInput {
    Scanner sc = new Scanner(System.in);
    char p = 'A';


    public void playerName(){

        System.out.println("Enter your name");
        System.out.println("Player " + p + ": " + sc.nextLine());
        p++;
        System.out.println(p);
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


