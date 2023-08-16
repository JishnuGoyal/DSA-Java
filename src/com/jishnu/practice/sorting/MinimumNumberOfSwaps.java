package com.jishnu.practice.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumNumberOfSwaps {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        int swaps = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(selection(arr));
    }

    public static int selection(int[] arr) {
        int swaps = 0;
        for (int last = arr.length - 1; last >= 1; last--) {
            int max_idx = 0;
            for (int i = 0; i <= last; i++) {
                if (arr[max_idx] < arr[i]) {
                    max_idx = i;
                }
            }
            int temp = arr[max_idx];
            arr[max_idx] = arr[last];
            arr[last] = temp;
            swaps++;
        }
        return swaps;
    }
}
