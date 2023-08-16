package com.jishnu.practice.recursion.advanced;

import java.util.Scanner;

public class N_Knights {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        placeKnight(n, "", 0, 0, n, n, new boolean[n][n]);
        System.out.println();
        System.out.print(count);
    }

    public static int count = 0;

    public static void placeKnight(int toPlace, String path, int row, int column, int ROWS, int COLUMNS, boolean[][] board) {
        if (toPlace == 0) {
            count = count + 1;
//            printBoard(board);
            System.out.print(path + " ");
            return;
        }

        if (column == COLUMNS) {
            column = 0;
            row = row + 1;
        }

        if (row == ROWS) {
            return;
        }

        if (isSafe(row, column, board)) {
            board[row][column] = true;
            placeKnight(toPlace - 1, path + prettyPrint(row, column), row, column + 1, ROWS, COLUMNS, board);
            board[row][column] = false;
        }
        placeKnight(toPlace, path, row, column + 1, ROWS, COLUMNS, board);

    }


    private static String prettyPrint(int row, int column) {
        return "{" + (row + 1) + "-" + (column + 1) + "} ";
    }

    // tells whether this position is available to fill or not
    public static boolean isSafe(int row, int column, boolean[][] board) {
//        if (board[row][column]) return false;

        if (checkCoordinateExists(row - 2, column - 1, board)) {
            if (board[row - 2][column - 1]) return false;
        }

        if (checkCoordinateExists(row - 2, column + 1, board)) {
            if (board[row - 2][column + 1]) return false;
        }

        if (checkCoordinateExists(row - 1, column - 2, board)) {
            if (board[row - 1][column - 2]) return false;
        }

        if (checkCoordinateExists(row - 1, column + 2, board)) {
            if (board[row - 1][column + 2]) return false;
        }

        return true;
    }

    public static boolean checkCoordinateExists(int row, int column, boolean[][] board) {
        return (row < board.length && column < board[0].length && row >= 0 && column >= 0);
    }

    private static void printBoard(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean isPlaced : row) {
                if (isPlaced) System.out.print("X ");
                else System.out.print("_ ");
            }
            System.out.println();
        }

    }
}
