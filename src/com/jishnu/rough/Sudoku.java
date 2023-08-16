package com.jishnu.rough;

import java.util.Arrays;

public class Sudoku {
    public static boolean isSolved = false;

    public static void main(String[] args) {
        char[][] board = {
                {'.', '.', '7', '.', '.', '.', '4', '.', '.'},
                {'6', '.', '.', '5', '.', '2', '.', '.', '9'},
                {'2', '4', '.', '.', '.', '.', '.', '5', '3'},
                {'.', '.', '9', '7', '1', '3', '6', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '5', '2', '9', '6', '3', '.', '.'},
                {'8', '1', '.', '.', '.', '.', '.', '3', '2'},
                {'7', '.', '.', '8', '.', '9', '.', '.', '4'},
                {'.', '.', '3', '.', '.', '.', '5', '.', '.'}
        };
        print(board);
        fillNumber(0, 0, board);
        print(board);
    }

    public static void print(char[][] board) {
        for (char[] row : board) {
            for (char ch : row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        System.out.println("------------------");
    }

    public static void fillNumber(int row, int column, char[][] board) {
        if (column == board[0].length) {
            column = 0;
            row = row + 1;
        }
        if (row == board.length) {
            isSolved = true;
            return;
        }

        if (board[row][column] != '.') {
            fillNumber(row, column + 1, board);
        } else {
            for (char ch = '1'; ch <= '9'; ch++) {
                if (isSafeForNumber(ch, row, column, board)) {
                    board[row][column] = ch;
                    fillNumber(row, column + 1, board);
                    if (isSolved) {
                        return;
                    }
                    board[row][column] = '.';  // explicit backtracking
                }
            }
        }
    }

    private static boolean isSafeForNumber(char ch, int row, int column, char[][] board) {
        for (char[] chars : board) {
            if (chars[column] == ch) return false;
        }
        for (int i = 0; i < board[0].length; i++) {
            if (board[row][i] == ch) return false;
        }

        // check which box are we in
        int ROW = row / 3;
        int COLUMN = column / 3;

        for (int i = ROW * 3; i < ROW * 3 + 3; i++) {
            for (int j = COLUMN * 3; j < COLUMN * 3 + 3; j++) {
                if (board[i][j] == ch) return false;
            }
        }
        return true;
    }
}

class chudoku {
    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println("Q==start");

        solve(0, 0, board);
        System.out.println("Q==end");
        print(board);

    }

    public static void print(char[][] board) {
        for (char[] r : board) {
            for (char b : r) {
                System.out.print(b);
            }
            System.out.println();
        }
    }

    static boolean positive = false;

    private static void solve(int r, int c, char[][] board) {
        if (c == 9) {
            r++;
            c = 0;
        }
        if (r == 9) {
            print(board);
            System.out.println("=======");
            positive = true;
            return;
        }
        if (board[r][c] != '.') {
            solve(r, c + 1, board);
        } else {
            for (char digit = '1'; digit <= '9'; digit++) {
                if (isSafe(r, c, digit, board)) {
                    board[r][c] = digit;
                    solve(r, c + 1, board);
                    if (positive) {
                        return;
                    }
                }
            }
            board[r][c] = '.';
        }
    }

    private static boolean isSafe(int r, int c, char digit, char[][] board) {
        // TODO Auto-generated method stub
        for (int R = 0; R < 9; R++) {
            if (board[R][c] == digit) {
                return false;
            }
        }
        for (int C = 0; C < 9; C++) {
            if (board[r][C] == digit) {
                return false;
            }
        }
        int boxR = r / 3;
        int boxC = c / 3;
        for (int R = boxR * 3; R < boxR * 3 + 3; R++) {
            for (int C = boxC * 3; C < boxC * 3 + 3; C++) {
                if (board[R][C] == digit) {
                    return false;
                }
            }
        }
        return true;
    }
}
