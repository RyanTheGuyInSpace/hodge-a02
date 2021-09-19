/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ryan Hodge
 */

package exercise;

import java.util.Scanner;

public class Solution09 {

    public static final int paintCoverageArea = 350;

    public static void main(String[] args) {

        // Prompt user for length ceiling
        // Prompt user for width of ceiling
        // Calculate how many buckets of paint will be needed based on the
        // user's inputs. Round result up

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the length of the ceiling in feet?");

        int length = scan.nextInt();

        System.out.println("What is the width of the ceiling in feet?");

        int width = scan.nextInt();

        int requiredArea = length * width;

        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet%n", (int)Math.ceil((double)requiredArea / (double)paintCoverageArea), requiredArea);

    }
}
