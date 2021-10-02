package com.bridgelabz;

import java.util.Scanner;

/**
 * Swapping of two numbers
 *
 * @author :Anji Raj Ardula
 * @version :16.0
 * @since : 02/10/2021
 */


public class SwapTwoNumbers {
    /**
     * Ask User To Enter The Two Numbers
     * And Swap The Two Numbers
     * Print The Swap Numbers
     */
    public static void main(String[] args) {
        int num1, num2, swap;
        //Ask user to enter the numbers for swap
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 value =  ");
        num1 = sc.nextInt();
        System.out.println("Enter the number 2 value =  ");
        num2 = sc.nextInt();
        System.out.println("Before swapping the numbers  :: " + num1 + "  " + num2);
        //condition for swapping two numbers
        swap = num1;
        num1 = num2;
        num2 = swap;
        System.out.println("After swapping the numbers  :: " + num1 + "  " + num2);
    }

}
