package com.jishnu.practice.arrays;

import java.util.Scanner;

public class Toeplitz {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int ROWS = scn.nextInt();
        int COLUMNS = scn.nextInt();
        int[][] matrix = new int[ROWS][COLUMNS];

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }
        System.out.println();
        int row = ROWS - 1, column = 0;
        int pass = 1;
        while (row >= 0 && column < COLUMNS) {
            int current = matrix[row][column];

            if (pass % 2 != 0) { // first, third
                while (row >= 0 && column >= 0) {
                    if (matrix[row][column] != current) {
                        System.out.println(false);
                        return;
                    }
                    row--;
                    column--;
                }
                if (row < 0) {
                    row = 0;
                    column = column + 2;
                } else {
                    column++;
                }
            } else {  // pass == 2 hence second, fourth diagonal
                while (row < ROWS && column < COLUMNS) {
                    if (matrix[row][column] != current) {
                        System.out.println(false);
                        return;
                    }
                    row++;
                    column++;
                }
                if (column >= COLUMNS) {
                    row = row - 2;
                    column--;
                } else {
                    row--;
                }
            }

            pass++;
        }

        System.out.println(true);
    }
}
