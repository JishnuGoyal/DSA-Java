package com.jishnu.practice.arrays;

import java.util.Scanner;

public class DiagonalTraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int columns = scn.nextInt();
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }
        System.out.println();
        int r = 0, c = 0;
        int pass = 1;
        while (r < rows && c < columns) {
            if (pass % 2 == 0) {  // second, fourth diagonals
                while (r < rows && c >= 0) {
                    System.out.print(matrix[r][c] + " ");
                    r++;
                    c--;
                }
                if (r == rows) {
                    r = rows - 1;
                    c = c + 2;
                } else c++;

            } else if (pass % 2 != 0) {  // first, third diagonals
                while (r >= 0 && c < columns) {
                    System.out.print(matrix[r][c] + " ");
                    r--;
                    c++;
                }
                if (c == columns) {
                    r = r + 2;
                    c--;
                } else {
                    r = 0;
                }
            }
            pass++;
        }
    }
}
