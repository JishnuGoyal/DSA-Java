package com.jishnu.practice.arrays;

import java.util.Scanner;

public class RotateImage {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }


        for (int column = n - 1; column >= 0; column--) {
            for (int row = 0; row < n; row++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
