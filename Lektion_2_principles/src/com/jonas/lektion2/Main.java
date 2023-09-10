package com.jonas.lektion2;

public class Main {

    public static void main(String[] args) {

        int newNumber = addition(100, 600);
        System.out.println(newNumber);
        System.out.println("a");
        System.out.print("b");
    }
    // TODO NOTES METODER
    /* /* Methods
     *   #1 - Methods within Methods == CRASH
     *   #2 - Visibility Mod (public)
     *   #3 - Must Return something (void)
     *   #4 - If inside MAIN, Add 'static'*/

    /*TODO NOTES
     *  Dry
     *  MIMC - More is more complex
     *  Y.A.G.N.I. - "You ain't gonna need it"
     *  KISS - "Keep It Simple Stupid"
     *  PROBLEM --> SOLUTION
     *
     *  */


// int[][] number = {{},{}};  // <-- multidimentionell array

    public static int addition(int x, int y) {
        return x + y;
    }
}
