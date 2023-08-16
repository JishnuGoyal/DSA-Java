package com.jishnu.practice.arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numberofinputs = scn.nextInt();
        long[] arr = new long[numberofinputs];

        for (int i = 0; i < numberofinputs; i++) {
            arr[i] = scn.nextLong();
        }

        int start = 0;
        int end = arr.length - 1;
        while (start != end) {
            long temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for (int i = 0; i < numberofinputs; i++) {
            System.out.print(arr[i]);
        }
    }

}
