/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ryan Hodge
 */

package exercise;

import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {

        // Prompt the user for their age
        // If the entered age is at least 16, say they are old enough to legally drive
        // Otherwise, say they are not old enough to legally drive

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your age?");

        int age = scan.nextInt();

        System.out.printf("You are%s old enough to legally drive", age >= 16 ? "" : " not");

    }
}
