/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ryan Hodge
 */

package exercise;

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {

        // Prompt the user for how many people there are
        // Prompt the user for how many pizzas there are
        // Prompt the user for how many slices each pizza has
        // Calculate how many slices of pizza each person can get evenly
        // Output how many slices each person gets as well as the amount leftover

        Scanner scan = new Scanner(System.in);

        System.out.println("How many people are there?");

        int numPeople = scan.nextInt();

        System.out.println("How many pizzas are there?");

        int numPizzas = scan.nextInt();

        System.out.println("How many slices does each pizza have?");

        int numSlicesPerPizza = scan.nextInt();

        int numTotalSlices = numPizzas * numSlicesPerPizza;

        int slicesPerPerson = numTotalSlices / numPeople;

        int remainder = numTotalSlices % numPeople;

        System.out.printf("%d people with %d pizzas (%d slices)%n", numPeople, numPizzas, numTotalSlices);

        System.out.printf("Each person gets %d pieces of pizza%n", slicesPerPerson);

        System.out.printf("There are %d leftover pieces%n", remainder);

    }
}
