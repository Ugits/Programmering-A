package com.jonas.demo;

import com.sun.tools.javac.Main;

/*TODO
*   Remove ‘static’ this time in: ‘Public static void main’
    What happens? Again, all ok if the app crashes!*/
public class PartFive {

    // public void main(String[] args) {

        /*  -   The file is not runnable
         *   -
         *   -   The keyword static is used to be able to call
         *   -   the main method without creating an instance of the Main class, and then calling main().
         *   -
         */

    //}


    //TODO Extra Research

    // In this example below I need 'static' main to call the Main class!
    public static void main(String[] args) {


        // I experimented a bit, and tried to create an object of the Main class:
        Main test = new Main(); // <-- uses: import com.sun.tools.javac.Main;

        // The error msg reads: " 'Main()' is deprecated and marked for removal "
        // According to oracle Documentation, the Main class may be removed in upcoming releases.
        // LINK: https://docs.oracle.com/javase%2F9%2Fdocs%2Fapi%2F%2F/com/sun/tools/javadoc/Main.html#main-java.lang.String...-

    }
}