package com.bridgelabz;

import java.util.Scanner;

/**
 * flipcoin
 *
 * @author :Anji Raj Ardula
 * @version :16.0
 * @since : 02/10/2021
 */

public class FlipCoin {
    public static void main(String[] args) {

        //variables decleration
        int head_count = 0;
        int tail_count = 0;
        double headsPercentage, tailsPercentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of times tossed");
        int coin_tossed = sc.nextInt();


        //for condition to check the probabilities whether it is heads/Tails
        for (int j = 0; j < coin_tossed; j++) {
            double flip_coin = Math.random();
            if (flip_coin < 0.5)
                tail_count++;
            else
                head_count++;
        }
        headsPercentage = head_count * 100 / coin_tossed;  //calculating the percentage
        tailsPercentage = tail_count * 100 / coin_tossed;
        System.out.println("Percentage of Heads:" + headsPercentage);
        System.out.println("Percentage of Tails: " + tailsPercentage);
        sc.close();

    }


}
