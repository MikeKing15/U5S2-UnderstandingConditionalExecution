package com.codedifferently.labs.partA.ex01;

import java.util.Scanner;

public class WatchMovie {
    public static String watchMovie() {
        Scanner scanner = new Scanner(System.in);
        String response = "";

        System.out.println("Enter the movie ticket price:");
        double price = scanner.nextDouble();

        System.out.println("Enter the movie rating (1 to 5):");
        int rating = scanner.nextInt();

        if (price >= 12 && rating == 5) {
            response = "I’m interested in watching the movie";
        } else {
            response = "I am not interested in watching the movie";
        }

        return response;
    }

    public static void main(String args[]) {
        String movieOutput = watchMovie();
        System.out.println(movieOutput);
    }
}
