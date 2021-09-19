/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ryan Hodge
 */

package exercise;

import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {

        // Prompt the user to enter C to convert from F to C
        // Or to enter F to convert from C to F
        // Print the user's choice back to them
        // Prompt the user for the temperate in the system they specified
        // Calculate the temperate in the opposing system and print it back to the user

        Scanner scan = new Scanner(System.in);

        int unit;

        String choice;
        String oppositeChoice;

        while (true) {

            System.out.println("Press C to convert from Fahrenheit to Celsius.");
            System.out.println("Press F to convert from Celsius to Fahrenheit.");

            choice = scan.nextLine().trim();

            if (choice.equalsIgnoreCase("f")) {
                unit = 0;
                System.out.println("Your choice: " + choice);
                choice = "Celcius";
                oppositeChoice = "Fahrenheiht";
                break;
            } else if (choice.equalsIgnoreCase("c")) {
                System.out.println("Your choice: " + choice);
                unit = 1;
                choice = "Fahrenheit";
                oppositeChoice = "Celcius";
                break;
            }

            System.out.println("Please enter F or C");
        }

        System.out.printf("Please enter the temperature in %s", choice);

        int currentTemp = scan.nextInt();

        int temp;

        if (choice.equals( "Fahrenheit")) {
            temp = (currentTemp - 32) * (5/9);
        } else {
            temp = ((currentTemp * (9/5)) + 32);
        }

        System.out.printf("The temperature in %s is %d",
                oppositeChoice,
                temp);




    }
}
