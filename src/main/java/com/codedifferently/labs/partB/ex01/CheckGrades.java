package com.codedifferently.labs.partB.ex01;

import java.util.Scanner;

public class CheckGrades {

    public static String checkGrades() {
        String response = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("What was your grade in Math?");
        double math = scanner.nextDouble();

        System.out.println("What was your grade in Science?");
        double science = scanner.nextDouble();

        System.out.println("What was your grade in Geography?");
        double geography = scanner.nextDouble();

        System.out.println("What was your grade in English?");
        double english = scanner.nextDouble();

        System.out.println("What was your grade in Java?");
        double java = scanner.nextDouble();

        double total = math + science + geography + english + java;
        double average = total / 5;

        response += "Total grade in five subjects: " + total + "\n";
        response += "My percentage: " + average;

        return response;
    }

    public static void main(String args[]) {
        String gradesOutput = checkGrades();
        System.out.println(gradesOutput);
    }
}
