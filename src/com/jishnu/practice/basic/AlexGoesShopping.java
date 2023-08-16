package com.jishnu.practice.basic;

import java.util.Scanner;

public class AlexGoesShopping {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int query = scn.nextInt();

        for (int i = 0; i < query; i++) {
            int A =  scn.nextInt();
            int k =  scn.nextInt();

            check(A, k, arr);
        }
    }

    private static void check(int a, int k, int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (a % arr[i] == 0) count++;
        }

        if (k <= count){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
