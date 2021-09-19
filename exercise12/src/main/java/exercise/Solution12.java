/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ryan Hodge
 */

package exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution12 {

    // 2 decimal place rounding format
    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        // Prompt the user for the principal amount
        // Prompt the user for the rate of interesting
        // Prompt the user for the number of years
        // Output the investment's worth at the end of the period

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the principal: ");

        double principal = scan.nextDouble();

        System.out.println("Enter the rate of interest: ");

        // Divide the interest rate by 100 for the percentage
        double interestRate = scan.nextDouble() / 100;

        System.out.println("Enter the number of years: ");

        int years = scan.nextInt();

        System.out.printf("After %d years at %s%%, the investment will be worth $%s",
                years,
                df.format(interestRate),
                df.format(principal * (1 + (interestRate * years))));




    }
}
