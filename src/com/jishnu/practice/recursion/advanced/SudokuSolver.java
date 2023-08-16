package com.jishnu.practice.recursion.advanced;

import java.util.Scanner;

public class SudokuSolver {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];

        COLUMNS = n;
        ROWS = n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        insertNumber(arr, 0, 0);
        print(arr);

    }

    public static void print(int[][] arr) {
        System.out.println("================");

        for (int[] row : arr) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    static int COLUMNS;
    static int ROWS;
    static boolean isSolved = false;

    public static void insertNumber(int[][] arr, int row, int column) {
        if (column == COLUMNS) {
            column = 0;
            row = row + 1;
        }

        if (row == ROWS) {
//            print(arr);
            isSolved = true;
            return;
        }

        if (arr[row][column] == 0) { // fill a new number
            for (int numberToInsert = 1; numberToInsert <= 9; numberToInsert++) {
                if (isSafeForNumber(arr, row, column, numberToInsert)) {
                    arr[row][column] = numberToInsert;
                    insertNumber(arr, row, column + 1);
                    if (isSolved) {
                        return;
                    }
                    arr[row][column] = 0; // explicit backtracking
                }

            }
        } else {
            insertNumber(arr, row, column + 1);
        }
    }

    private static boolean isSafeForNumber(int[][] arr, int row, int column, int number) {
        // check current row
        for (int i = 0; i < ROWS; i++) {
            if (arr[i][column] == number) return false;
        }

        // check current column
        for (int i = 0; i < COLUMNS; i++) {
            if (arr[row][i] == number) return false;
        }

        // check current box
        int r = row / 3;
        int c = column / 3;

        for (int i = r * 3; i < r * 3 + 3; i++) {
            for (int j = c * 3; j < c * 3 + 3; j++) {
                if (arr[i][j] == number) return false;
            }
        }
        return true;
    }
}
