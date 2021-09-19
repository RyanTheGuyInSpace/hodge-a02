package exercise;/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ryan Hodge
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution10 {

    // 5.5% tax rate
    public static final double taxRate = 0.055;

    // 2 decimal place rounding format
    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        // Prompt the user for three items' prices and quantity
        // Calculate the subtotal of the items without the tax included
        // Calculate how much will be charged for taxes
        // Calculate the grand total
        // Print back the total, tax, and total with tax to the user

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the price of item 1: ");

        double item1Price = scan.nextDouble();

        System.out.println("Enter the quantity of item 1: ");

        int item1Quantity = scan.nextInt();

        System.out.println("Enter the price of item 2: ");

        double item2Price = scan.nextDouble();

        System.out.println("Enter the quantity of item 2: ");

        int item2Quantity = scan.nextInt();

        System.out.println("Enter the price of item 3: ");

        double item3Price = scan.nextDouble();

        System.out.println("Enter the quantity of item 3: ");

        int item3Quantity = scan.nextInt();

        double subtotal = (item1Quantity * item1Price)
                + (item2Quantity * item2Price)
                + (item3Quantity * item3Price);

        double tax = subtotal * taxRate;

        double grandTotal = subtotal + tax;

        String subtotalLine = "Subtotal: " + df.format(subtotal);

        String taxLine = "Tax: " + df.format(tax);

        String grandTotalLine = "Total: " + df.format(grandTotal);

        System.out.println(subtotalLine);

        System.out.println(taxLine);

        System.out.println(grandTotalLine);

    }
}
