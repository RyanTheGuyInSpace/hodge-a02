/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ryan Hodge
 */

package exercise;

import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {

        // Prompt the user for their gender using numbers
        // Prompt the user for how many ounces of alcohol they had
        // Prompt the user for their weight in pounds
        // Prompt the user for how many hours it's been since their last drink

        Scanner scan = new Scanner(System.in);

        int gender;

        while (true) {

            System.out.println("Enter a 1 if you are male of a 2 if you are female");

            try {
                gender = Integer.parseInt(scan.nextLine());

                if (gender > 2) {
                    System.out.println("Please enter either 1 or 2");

                    continue;
                }

                break;
            } catch (Exception e) {

            }
        }

        int ounces;

        while (true) {

            System.out.println("How many ounces of alcohol did you have?");

            try {
                //scan.next();
                ounces = Integer.parseInt(scan.nextLine());

                break;
            } catch (Exception e) {

            }
        }

        int weight;

        while (true) {

            System.out.println("What is your weight, in pounds?");

            try {
                //scan.next();
                weight = Integer.parseInt(scan.nextLine());

                break;
            } catch (Exception e) {

            }
        }

        int hoursSinceLastDrink;

        while (true) {

            System.out.println("How many hours has is been since your last drink?");

            try {
                //scan.next();
                hoursSinceLastDrink = Integer.parseInt(scan.nextLine());

                break;
            } catch (Exception e) {

            }
        }

        double alcoholDistRatio = gender == 1 ? 0.73 : 0.66;

        double BAC = (((ounces * 5.14) / (weight * alcoholDistRatio)) - (0.015 * hoursSinceLastDrink));

        System.out.printf("Your BAC is %f%n", BAC);

        if (BAC >= 0.08) {
            System.out.println("It is not legal for you to drive");
        } else {
            System.out.println("It is legal for you to drive");
        }

    }
}
