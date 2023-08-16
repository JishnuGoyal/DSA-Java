package com.jishnu.practice.recursion.advanced;

import java.util.Scanner;

public class Mazepath_D2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        findWays("", 0, 0, input, input);
        System.out.println();
        System.out.print(count);
    }

    public static int count = 0;

    public static void findWays(String path, int row, int column, int ROWS, int COLUMNS) {
        if (row >= ROWS || column >= COLUMNS || row < 0 || column < 0) {
            return;
        }

        if (row == ROWS - 1 && column == COLUMNS - 1) {
            count = count + 1;
            System.out.print(path + " ");
            return;
        }

        findWays(path + "V", row + 1, column, ROWS, COLUMNS);
        findWays(path + "H", row, column + 1, ROWS, COLUMNS);
        if (row == column || row + column == ROWS - 1 /* condition for diagonal */) {
            findWays(path + "D", row + 1, column + 1, ROWS, COLUMNS);
        }
    }
}
