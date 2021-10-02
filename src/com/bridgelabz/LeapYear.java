package com.bridgelabz;

import java.util.Scanner;

/**
 * LeapYear
 *
 * @author :Anji Raj Ardula
 * @version :16.0
 * @since : 02/10/2021
 */


public class LeapYear {
    /**
     * Asking user to enter the valid Year
     * Condition, year should be 4 digits
     * Printing the leap year
     */
    public static void main(String[] args) {

        //entering the year from user end
        System.out.println("Enter the year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (checkYear(year))
            checkLeapyear(year);
        else
            System.out.println("Enter the valid four digit number");
        sc.close();
    }

    public static boolean checkYear(int year) {
        if (year < 999)
            return false;
        return true;
    }

    //logic for Leap Year calculation
    public static void checkLeapyear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("The year is Leap Year");
        } else
            System.out.println("The Year is Not a Leap Year");


    }
}
