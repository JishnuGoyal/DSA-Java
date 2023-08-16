package com.jishnu.practice.basic;

import java.util.Scanner;

public class ShoppingGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int testcases = scn.nextInt();
        while (testcases > 0) {
            int oddLimit = scn.nextInt();
            int evenLimit = scn.nextInt();

            int oddPurchases = 1;
            int oddCount = 1;
            while (oddPurchases <= oddLimit) {
                oddPurchases += 2;
                oddCount++;
            }

            int evenCount = 0;
            int evenPurchases = 0;
            while (evenPurchases <= evenLimit) {
                evenPurchases += 2;
                evenCount++;
            }

            if (evenCount > oddCount) System.out.println("Harshit");
            else System.out.println("Aayush");
            testcases--;
        }
    }
}
