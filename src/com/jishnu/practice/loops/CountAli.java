package com.jishnu.practice.loops;

import java.util.Scanner;

public class CountAli {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        long[] arr = new long[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextLong();
        }
        long target = scn.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) count++;
        }

        System.out.println(count);
    }
}
