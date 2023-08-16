package com.jishnu.practice.arrays;

import java.util.Scanner;

public class RainWaterTrapping {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int testcases = scn.nextInt();
        while(testcases > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }

            int startHeight = arr[0];
            int endHeight = arr[arr.length - 1];
            int startPointer = 0;
            int endPointer = arr.length - 1;
            int startIndex = 0;
            int endIndex = arr.length - 1;
            int area = 0;
            int blockage = 0;

            // initialise startPointer and start height
            while (arr[startPointer] == 0) {
                startPointer++;
                startHeight = arr[startPointer];
                startIndex = startPointer;
            }

            // initialise endPointer and end height
            while (arr[endPointer] == 0) {
                endPointer--;
                endHeight = arr[endPointer];
                endIndex = endPointer;
            }

            while (startPointer < endPointer - 1) {
                startPointer++;
                if (arr[startPointer] <= startHeight) blockage += arr[startPointer];
                else if (arr[startPointer] > startHeight) {
                    area += startHeight * (startPointer - startIndex) - blockage;
                    startIndex = startPointer;
                    startHeight = arr[startPointer];
                    blockage = 0;
                }
            }
            area += Math.min(startHeight, endHeight) * (endIndex - 1 - startIndex) - blockage;

            System.out.println(area);
            testcases--;
        }
    }
}


