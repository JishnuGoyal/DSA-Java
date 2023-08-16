package com.jishnu.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedSquares {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numberofinputs = scn.nextInt();
        long[] arr = new long[numberofinputs];

        for (int i = 0; i < numberofinputs; i++) {
            arr[i] = scn.nextLong();
            arr[i] = Math.abs(arr[i]);
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] * arr[i] + " ");
        }
    }
}
