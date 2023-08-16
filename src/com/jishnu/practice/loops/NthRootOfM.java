package com.jishnu.practice.loops;

import java.util.Scanner;

public class NthRootOfM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int testcases = scn.nextInt();
        for (int i = 0; i < testcases; i++) {
            int n = scn.nextInt();
            int m = scn.nextInt();
            binarysearch(n, m);
        }
    }

    private static void binarysearch(int n, int m) {
        int start = 0;
        int end = m;

        // n root m is to be found
        // find t such that t^n = m
        while (start <= end) {
            int root = start + (end - start) / 2;
            int mid = (int) Math.pow(root, n);
            if (mid == m) {
                System.out.println(root);
                return;
            } else if (mid < m) {
                start = root + 1;
            } else {
                end = root - 1;
            }
        }
        System.out.println(-1);
    }
}
