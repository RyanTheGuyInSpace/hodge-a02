/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ryan Hodge
 */

package exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution13 {

    // 2 decimal place rounding format
    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        // Prompt the user for the principal amount
        // Prompt the user for the rate of interesting
        // Prompt the user for the number of years
        // Prompt the user for the number of times the interest is compounded yearly
        // Output the investment's worth at the end of the period

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the principal: ");

        double principal = scan.nextDouble();

        System.out.println("Enter the rate of interest: ");

        // Divide the interest rate by 100 for the percentage
        double interestRate = scan.nextDouble() / 100;

        System.out.println("Enter the number of years: ");

        int years = scan.nextInt();

        System.out.println("What is the number of times the interest is compounded per year?");

        int yearlyCompounds = scan.nextInt();

        System.out.printf("$%s invested at %s%% for %d years compounded %d times per year is $%s.",
                df.format(principal),
                df.format(interestRate),
                years,
                yearlyCompounds,
                df.format(principal * Math.pow(1 + interestRate / yearlyCompounds, (double)yearlyCompounds * years)));

    }
}
