package com.pluralsight;

import java.util.Scanner;

public class Utils {
    private Utils() {
        // prevent instantiation
    }
    public static int promptInt(Scanner scanner, String intPrompt) {
        System.out.print("Enter " + intPrompt + ": ");
        int num = -1;
        while (num <= 0) {
            // If user inputs valid number
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num <= 0) {
                    System.out.println("Please enter a positive number");
                }
                // If user did not input a valid number
            }  else {
                System.out.println("Please enter a valid number");
                // Eats the invalid input
                scanner.next();
            }
        }
        return num;
    }
}
