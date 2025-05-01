package com.codedifferently.labs.partB.ex02;

public class Ternary {

    public static String ternary(){
        int x = 20;
        int y;

        y = (x == 1) ? 90 : 0;
        System.out.println("Value of y is: " + y);

        y = (x == 20) ? 61 : 0;
        System.out.println("Value of y is: " + y);

        return "operation completed";
    }

    public static void main(String args[]) {
        String output = ternary();
        System.out.println(output);
    }
}
