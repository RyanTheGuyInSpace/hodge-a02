/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Ryan Hodge
 */

package exercise;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {

        // Prompt user for their current age
        // Prompt user for their desired retirement age
        // Print how many years the user has until they reach their target retirement age
        // Print the current year and the year the user will be able to retire

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your current age?");

        int currentAge = scan.nextInt();

        System.out.println("At what age would you like to retire?");

        int targetRetirementAge = scan.nextInt();

        int remainingYearsTillRetirement = targetRetirementAge - currentAge;

        System.out.printf("You have %d years left until you can retire.%n", remainingYearsTillRetirement);

        //int currentYear = Calendar.getInstance().getTime();

        int year = Integer.parseInt(new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime()));

        System.out.printf("It's %d, so you can retire in %d", year, year + remainingYearsTillRetirement);

        scan.close();
    }
}
