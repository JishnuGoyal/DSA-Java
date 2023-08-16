package com.jishnu.practice.recursion.advanced;

import java.util.Scanner;

/*
* The best approach here is to use palindrome partitioning. Discussed in class, code at lec 30 on GitHub.
* */
public class VivekLovesArrayGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tests = scn.nextInt();
        while (tests > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            System.out.println(makeChops(0, arr.length - 1, arr));
            tests--;
        }
    }

    public static int makeChops(int start, int end, int[] arr) {
        int localScore = 0;
        if (start == end) {
            return 0;
        }

        // if sum is zero, handle by number of zeroes in array
        if (sumIsZero(arr, start, end)) {
            return end - start;
        }

        // find chop-able index
        int startSum = arr[start];
        int endSum = arr[end];

        while (start < end - 1) {
            if (startSum == endSum) start++;
            while (startSum > endSum) {
                end--;
                endSum += arr[end];
            }

            while (endSum > startSum) {
                start++;
                startSum += arr[start];
            }
        }

        if (endSum == startSum) {
            int a = makeChops(start, end - 1, arr);
            int b = makeChops(end, arr.length - 1, arr);
            localScore = 1 + Math.max(a, b);
        }

        return localScore;

    }

    private static boolean sumIsZero(int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
