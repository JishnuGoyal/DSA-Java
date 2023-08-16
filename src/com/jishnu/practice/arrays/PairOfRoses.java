package com.jishnu.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int testcases = scn.nextInt();

        for (int i = 0; i < testcases; i++) {
            int numberofinputs = scn.nextInt();
            int[] arr = new int[numberofinputs];

            for (int j = 0; j < numberofinputs; j++) {
                arr[j] = scn.nextInt();
            }

            int money = scn.nextInt();

            System.out.println();
            findRoses(arr, money);

        }
    }

    private static void findRoses(int[] arr, int money) {
        Arrays.sort(arr);
        int minFirstIndex = 0;
        int minSecondIndex = 1;

        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == money) {
                    int difference = arr[j] - arr[i];
                    if (difference < minDifference) {
                        minDifference = difference;
                        minFirstIndex = i;
                        minSecondIndex = j;
                    }
                }
            }
        }

        System.out.print("Deepak should buy roses whose prices are " + arr[minFirstIndex] + " and " + arr[minSecondIndex] + ".");
    }

    private static void findPairs(int[] arr, int money) {
        Arrays.sort(arr);

        int start = arr.length / 2 - 1;
        int end = arr.length / 2;
        int diff = 0;
        int p1;
        int p2;
        while (start >= 0 && end < arr.length) {
            if (arr[start] + arr[end] == money) {
                System.out.println("Deepak should buy roses whose prices are " + arr[start] + " and " + arr[end] + ".");
                return;
            } else if (arr[start] + arr[end] > money) {
                start--;
            } else {
                end++;
            }
        }
    }
}
