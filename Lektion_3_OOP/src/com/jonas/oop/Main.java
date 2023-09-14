package com.jonas.oop;

public class Main {

    public static void main(String[] args) {
        /*Main sdf = new Main();

        System.out.println("App is running");

        System.out.println(addition(15,15));
        */
        //Instanciate object
        Student benny = new Student();
        benny.name = "Benny";
        benny.age = 15;

        System.out.println(benny.name + " " + benny.age);
    }

    /* TODO Creating a Method
    * #1 Visibility Modifier: public, protected, no-mod, private
    * #2 Static: exclude if not needed
    * #3 Datatype to return: Send data. If nothing == void
    * #4 Name: camelcase (addTwoNumbers) followed by () {}
    * */
    public static int addition(int x, int y) {

        return x+y;
    }
}
