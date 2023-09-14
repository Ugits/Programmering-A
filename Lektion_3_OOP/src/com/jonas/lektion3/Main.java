package com.jonas.lektion3;

import com.jonas.lektion3.model.Student;

public class Main {

    public static void main(String[] args) {
        /*Main sdf = new Main();

        System.out.println("App is running");

        System.out.println(addition(15,15));
        */
        //Instantiate object
        Student benny = new Student("Benny", 15, true);
        Student frida = new Student("Frida", 22, false);

        System.out.println(benny.name);
        System.out.println(benny.age);
        System.out.println(benny.isTired);
        System.out.println(frida.name);
        System.out.println(frida.age);
        System.out.println(frida.isTired);
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

