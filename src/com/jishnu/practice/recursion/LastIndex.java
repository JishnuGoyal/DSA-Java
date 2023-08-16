package com.jishnu.practice.recursion;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();

        last(arr.length - 1, arr, target);
    }

    public static void last(int index, int[] arr, int target) {
        if (arr[index] == target) {
            System.out.println(index);
            return;
        }
        if (index <= 0) {
            System.out.println(-1);
            return;
        }
        last(index - 1, arr, target);
    }
}
