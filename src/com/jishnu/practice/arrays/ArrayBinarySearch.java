package com.jishnu.practice.arrays;

import java.util.Scanner;

public class ArrayBinarySearch {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextLong();
        }

        long m = scn.nextLong();
        int index = binarySearch(arr, m);
        System.out.println(index);
    }

    private static int binarySearch(long[] arr, long target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
