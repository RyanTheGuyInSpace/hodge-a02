/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ryan Hodge
 */

package exercise;

import java.util.Scanner;

public class Solution07 {
    static final double feetToMetersConversionRate = 3.28084;

    public static void main(String[] args) {

        // Prompt the user for the length of the room in feet
        // Prompt the user for the width of the room in feet
        // Print the entered data back to the user as well as the area of the room in
        // square feet and meters

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the length of the room in feet?");

        int roomLength = scan.nextInt();

        System.out.println("What is the width of the room in feet?");

        int roomWidth = scan.nextInt();

        System.out.printf("You entered dimensions of %d feet by %d feet", roomLength, roomWidth);

        double areaFeet = roomLength * roomWidth;
        double areaMeters = (roomLength * feetToMetersConversionRate) * (roomWidth * feetToMetersConversionRate);

        System.out.println("The area is...");
        System.out.printf("%f square feet", areaFeet);
        System.out.printf("%f square meters", areaMeters);

    }
}
