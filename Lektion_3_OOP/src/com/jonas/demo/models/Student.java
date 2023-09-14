package com.jonas.demo.models;

public class Student {
    public String name;
    public int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // PART 8
    public String toString(){  // <---------- NOTE ... Se Object Class (Object.java),
        return name + age;
    }

    public static int doubleMyAge(int age){
        return age*2;
    }


}
