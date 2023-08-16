package com.jishnu.practice.arrays;

import java.util.Scanner;

public class MaximumSumPath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size1 = scn.nextInt();
        int size2 = scn.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        int maxindex = Math.min(size1, size2);

        for (int i = 0; i < size1; i++) {
            arr1[i] = scn.nextInt();
        }

        for (int i = 0; i < size2; i++) {
            arr2[i] = scn.nextInt();
        }

        int currentindex = 0;
        int result = 0;
        int subsequencesum1 = 0;
        int subsequencesum2 = 0;
        int value1 = 0;
        int value2 = 0;
        while (currentindex < maxindex) {
            value1 = arr1[currentindex];
            value2 = arr2[currentindex];
            subsequencesum1 += value1;
            subsequencesum2 += value2;

            if (value1 == value2){
                result = result + Math.max(subsequencesum1, subsequencesum2);
                subsequencesum1 = 0;
                subsequencesum2 = 0;
            }

            currentindex++;
        }

        if (value1 != value2) result = result + Math.max(subsequencesum1, subsequencesum2);
        System.out.println(result);
    }
}
