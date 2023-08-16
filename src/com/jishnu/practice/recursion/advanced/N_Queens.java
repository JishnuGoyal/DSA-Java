package com.jishnu.practice.recursion.advanced;

import java.util.Scanner;

public class N_Queens {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        placeQueen(n, "", 0, 0, n, n, new boolean[4][4]);
    }

    public static void placeQueen(int toPlace, String path, int row, int column, int ROWS, int COLUMNS, boolean[][] board) {
        if (toPlace == 0) {
            printBoard(board);
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
            placeQueen(toPlace - 1, path + prettyPrint(row, column), row, column + 1, ROWS, COLUMNS, board);
            board[row][column] = false;
        }
        placeQueen(toPlace, path, row, column + 1, ROWS, COLUMNS, board);

    }



    private static String prettyPrint(int row, int column) {
        return "{" + (row + 1) + " - " + (column + 1) + "} ";
    }

    // tells whether this position is available to fill or not
    public static boolean isSafe(int row, int column, boolean[][] board) {
        if (board[row][column]) return false;

        // check current row till position
        for (int i = 0; i <= row; i++) {
            if (board[i][column]) return false;
        }

        // check current column till position
        for (int i = 0; i <= column; i++) {
            if (board[row][i]) return false;
        }

        // check current diagonal till position
        int ROW = row - 1;
        int COLUMN = column - 1;
        while (ROW >= 0 && COLUMN >= 0) {
            if (board[ROW][COLUMN]) return false;
            ROW--;
            COLUMN--;
        }

        ROW = row - 1;
        COLUMN = column + 1;
        // check other diagonal
        while (ROW >= 0 && COLUMN < board[0].length) {
            if (board[ROW][COLUMN]) return false;
            ROW--;
            COLUMN++;
        }

        return true;
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
