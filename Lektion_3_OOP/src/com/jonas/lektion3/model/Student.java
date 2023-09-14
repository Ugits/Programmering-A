package com.jonas.lektion3.model;

public class Student {

    public String name;
    public int age;
    public boolean isTired; // NEW
    //Add new value later

    // Constructor
    // Value = instantiation
    public Student(String name, int age, boolean isTired) {
        this.name = name;
        this.age = age;
        this.isTired = isTired;
    }
}
