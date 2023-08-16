package com.jishnu.practice.recursion;

import java.util.Scanner;

public class Subsets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();

        findSubsets(0, "", 0, 3, arr, target);
    }

    public static void printReversed(String input) {
        for (int i = input.length() - 2 ; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println();
    }

    private static void findSubsets(int index, String path, int sum, int r, int[] arr, int target) {
        if ((sum == target && r == 0) || (sum == target && r == 1)) {
            printReversed(path);
            return;
        }
        if (r == 0) {
            return;
        }
        if (index == arr.length) {
            return;
        }

        findSubsets(index + 1, path, sum, r, arr, target);
        findSubsets(index + 1, path + arr[index] + " ", sum + arr[index], r - 1, arr, target);

    }
}
