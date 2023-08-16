package com.jishnu.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TargetTripleSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numberofinputs = scn.nextInt();
        int[] arr = new int[numberofinputs];

        for (int i = 0; i < numberofinputs; i++) {
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        int target = scn.nextInt();

        for (int fixednumber = 0; fixednumber < arr.length - 2; fixednumber++) {
            int start = fixednumber + 1;
            int end = arr.length - 1;
            while (start < end) {
                if (arr[fixednumber] + arr[start] + arr[end] == target) {
                    System.out.println(arr[fixednumber] + ", " + arr[start] + " and " + arr[end]);
                    start++;
                } else if (arr[fixednumber] + arr[start] + arr[end] > target) end--;
                else if (arr[fixednumber] + arr[start] + arr[end] < target) start++;
            }
        }

    }
}
