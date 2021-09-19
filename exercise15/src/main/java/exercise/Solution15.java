/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ryan Hodge
 */

package exercise;

import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {

        // Prompt the user for the password
        // If the password is recognized, print a welcome message
        // Otherwise, print a denial message

        String correctPassword = "abc$123";

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the password?");

        String password = scan.nextLine();

        if (password.equals(correctPassword)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
        }



    }
}
