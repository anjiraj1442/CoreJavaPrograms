package com.bridgelabz;

import java.util.Scanner;

/**
 * Largest of three numbers
 *
 * @author :Anji Raj Ardula
 * @version :16.0
 * @since : 02/10/2021
 */


public class LargestOfThreeNumbers {
    /**
     * Asking user to enter the three numbers
     * Using if-else to find the larger one
     */
    public static void main(String[] args) {
        //enter the input numbers
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = sc.nextInt();
        System.out.print("Enter the second number:");
        y = sc.nextInt();
        System.out.print("Enter the third number:");
        z = sc.nextInt();
        //condition to find the Largest number
        if (x > y && x > z) {
            System.out.println("Largest number is :" + x);
        } else if (y > z) {
            System.out.println("Largest number is :" + y);
        } else {
            System.out.println("Largest number is :" + z);
        }
    }

}
