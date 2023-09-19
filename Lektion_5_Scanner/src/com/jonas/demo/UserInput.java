package com.jonas.demo;

import java.util.Scanner;

public class UserInput {
    Scanner sc = new Scanner(System.in);



    public void playerName(){
        System.out.println("Enter your name");
        System.out.println("Player #1: " + sc.nextLine());

    }
}


