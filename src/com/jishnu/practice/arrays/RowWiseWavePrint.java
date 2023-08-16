package com.jishnu.practice.arrays;

import java.util.Scanner;

public class RowWiseWavePrint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int columns = scn.nextInt();
        int[][] arr = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                int rowindex = j;
                if (i % 2 != 0) {
                    rowindex = rows - 1 - rowindex;
                }
                System.out.print(arr[rowindex][i] + ", ");
            }
        }

        System.out.println("END");
    }
}
