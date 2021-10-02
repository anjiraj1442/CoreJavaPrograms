package com.bridgelabz;

import java.util.Scanner;

/**
 * java Program to Check Whether an Alphabet is Vowel or Consonant
 *
 * @author :Anji Raj Ardula
 * @version :16.0
 * @since : 02/10/2021
 */

public class AlphabetCheck {
    public static void main(String[] args) {
        //Welcome Message Added
        System.out.println("A program to check whether the Alphabet is Vowel or Consonant");
        //Ask User To Enter The Alphabet
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);
        System.out.println("Entered Character is : " + ch);
        //If Condition For To Check The Alphabet Is Vowel Or Not
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The Entered Character " + ch + " is Vowel");
        } else {
            System.out.println("The Entered Character " + ch + " is Consonant");
        }
    }

}



