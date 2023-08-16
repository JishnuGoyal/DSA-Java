package com.jishnu.basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BasicsPracticeQuestions {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int numberofElements = scn.nextInt();
        long[] arr = new long[numberofElements];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextLong();
        }

        findGoodSubArrays(arr);

    }

    private static void findGoodSubArrays(long[] arr) {
        int target = arr.length;
        int count = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum % target == 0) count++;
            }
            sum = 0;
        }
        System.out.println(count);
    }
}
