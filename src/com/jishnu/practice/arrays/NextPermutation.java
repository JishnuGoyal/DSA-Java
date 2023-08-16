package com.jishnu.practice.arrays;

import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tests = scn.nextInt();
        while (tests > 0) {
            nextPermutation(scn);
            tests--;
        }
    }

    public static void nextPermutation(Scanner scn) {
        int size = scn.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int index = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            int minimumElement = Integer.MAX_VALUE;
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < minimumElement && arr[j] > arr[i]) {
                    minimumElement = arr[j];
                    index = j;
                }
            }
            if (index != -1) {
                // swap and return;
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                print(arr, true);
                return;
            }
        }

        // print original array in reverse order since no next permutation is possible
        print(arr, false);
    }

    private static void print(int[] arr, boolean isFound) {
        System.out.println();

        if (isFound) {
            for (int element : arr) System.out.print(element + " ");
        } else for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

}
