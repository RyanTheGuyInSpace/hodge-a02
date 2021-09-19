/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ryan Hodge
 */

package exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution14 {

    // 2 decimal place rounding format
    private static DecimalFormat df = new DecimalFormat("0.00");

    public static final double taxRateWI = 0.055;

    public static void main(String[] args) {

        // Prompt the user for the order amount
        // Prompt the user for the state
        // If the state is WI, use a tax rate of 5.5%

        double taxRate = 0.065;

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the order amount?");

        double orderAmount = scan.nextDouble();

        System.out.println("What is the state?");

        scan.next();
        String state = scan.nextLine().trim();

        if (state.equals("WI")) {
            taxRate = taxRateWI;
        }

        System.out.printf("The subtotal is $%s.%n" +
                "The tax is $%s.%n" +
                "The total is $%s",
                df.format(orderAmount),
                df.format(orderAmount * taxRate),
                df.format(orderAmount + (orderAmount + taxRate)));

    }
}
