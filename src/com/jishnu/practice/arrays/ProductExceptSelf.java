package com.jishnu.practice.arrays;

import java.util.Scanner;

public class ProductExceptSelf {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numberofinputs = scn.nextInt();
        long[] arr = new long[numberofinputs];
        long product = 1;

        for (int i = 0; i < numberofinputs; i++) {
            arr[i] = scn.nextLong();
            product *= arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(product / arr[i] + " ");
        }


    }
}
