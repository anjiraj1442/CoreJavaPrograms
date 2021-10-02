package com.bridgelabz;

import java.util.Scanner;

/**
 * java Program to Check Whether even number or odd number
 *
 * @author :Anji Raj Ardula
 * @version :16.0
 * @since : 02/10/2021
 */


public class EvenOrOdd {
    /**
     * Ask User To Enter a Number
     * And Check That Number Is Even Or Odd
     * And Print The Number
     */
    public static void main(String[] args) {
        int number;
        System.out.println("A program to Check whether the number is Even or Odd");
        //Ask user to enter the number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check = ");
        number = sc.nextInt();
        //Condition to check the number
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even number ");
        } else {
            System.out.println("The number " + number + " is odd number ");
        }
    }
}
