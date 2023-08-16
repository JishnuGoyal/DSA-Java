package com.jishnu.practice.arrays;

import java.util.Scanner;

public class InverseOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numberofinputs = scn.nextInt();
        int[] arr = new int[numberofinputs];

        for (int i = 0; i < numberofinputs; i++) {
            arr[i] = scn.nextInt();
        }

        int valueAtOne = arr[1];

        for (int index = 0; index < arr.length; index++) {
            int value = arr[index];
            // swap
            int temp = arr[value];
            arr[value] = index;
            arr[index] = temp;
        }

        arr[valueAtOne] = 1;

        System.out.println();
        for (int i = 0; i < numberofinputs; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
