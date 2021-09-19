/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ryan Hodge
 */

package exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution11 {

    // 2 decimal place rounding format
    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        // Prompt the user for how many euros they are exchanging
        // Prompt the user for the change rate
        // Calculate how many US dollars the user will get back
        // Print how many US dollars the user will get back

        Scanner scan = new Scanner(System.in);

        System.out.println("How many euros are you exchanging?");

        double euros = scan.nextDouble();

        System.out.println("What is the exchange rate?");

        double exchangeRate = scan.nextDouble();

        System.out.printf("%s euros at an exchange rate of %s is %s",
                euros,
                exchangeRate,
                df.format(Math.round(((euros * exchangeRate) * 100.0)) / 100.0));
    }
}
