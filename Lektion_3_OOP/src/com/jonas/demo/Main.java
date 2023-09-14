package com.jonas.demo;

import com.jonas.demo.models.Student;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Student studentEx = new Student("Jonas", 35);
        System.out.println(studentEx.name + studentEx.age);



        Random ageInput = new Random();
        String[] names = {"Kalle ", "Fredrik ", "Bob ", "Stina ", "Åsa "};

        for (int i = 0; i < 5; i++) {
            Student student = new Student(names[i], ageInput.nextInt(15,65));
            System.out.println(student.name + student.age + "<-- Part 6");
        }

        System.out.println(Student.doubleMyAge(studentEx.age)+"<-- Part 7");

        Student benny = new Student("Benny", 15);

        System.out.println(benny);
    }
}

/*TODO Experiment
    ------------------------------------------------------------------------------------------------------------------
*  - Changing the class visibility modifier
*       - Private   Error: "Modifier 'private' not allowed here"
*       - Protected Error: "Modifier 'private' not allowed here" / "'com.jonas.demo.models.Student' has protected access in 'com.jonas.demo.models'"
*       - Nothing   Error: "'com.jonas.demo.models.Student' is not public in 'com.jonas.demo.models'. Cannot be accessed from outside package"
*       - Public    Works
*   -------------------------------------------------------------------------------------------------------------------
*  - Part 5 - change Visibility mod for variable in Student class
*       - Private   no access to variables - Error: "name has private access in com.jonas.demo.models.Student"
*       - Protected no access to variables - Error: "'name' has protected access in 'com.jonas.demo.models.Student'"
*       - Nothing   Works
*       - Public    Works - but what about variable privacy?
    -------------------------------------------------------------------------------------------------------------------
   -
* */
