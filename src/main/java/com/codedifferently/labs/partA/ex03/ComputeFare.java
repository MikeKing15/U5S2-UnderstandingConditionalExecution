package com.codedifferently.labs.partA.ex03;

import java.util.Scanner;

public class ComputeFare {
    public static int compute(int age) {
        int response = 0;

        if (age < 11) {
            response = 3;
        } else if (age > 11 && age < 65) {
            response = 5;
        } else {
            response = 3;
        }

        return response;
    }

    public static void main(String args[]) {
        int age = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = scanner.nextInt();

        int computeOutput = compute(age);
        System.out.println("fare=" + computeOutput + "$");
    }
}
