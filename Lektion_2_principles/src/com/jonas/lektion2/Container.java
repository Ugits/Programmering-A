package com.jonas.lektion2;

public class Container {

    public void container() {



        /*TODO
         *  #1 if()
         *  #2 else
         *  #3 switch*/

        // MAC - Command + option + L (Line up code)

        // #1

        int x = 250;
        int y = 200;
        if (x > y) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        int age = 18;
        if (age >= 18) {
            System.out.println("You are an adult");
        }


        int day = 1; // day of the week
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Something...");
                break;
        }


        int[] numbers = {10, 20, 30, 40, 50, 60};
        for (int i = 1; i < numbers.length; i++) {

            System.out.println(numbers[i]);
            //i++
        }
        System.out.println(numbers.length);


        char character = 'A' + 'B'; // skriver inte ut något??


        System.out.println(character);
    }
}
