package com.jishnu.rough;

public class BlockedMaze {
    public static void main(String[] args) {
        int[][] maze = {
                {0, 1, 0, 0},
                {0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0}
        };

        findPath(0, 0, "", maze, new boolean[4][4]);
    }

    public static void findPath(int row, int column, String path, int[][] maze, boolean[][] isVisited) {
        if (row == maze.length - 1 && column == maze[0].length) { // +ve BC
            System.out.println(path);
            return;
        }

        if (row < 0 || column < 0 || row > maze.length - 1 || column > maze[0].length - 1 || maze[row][column] == 1 || isVisited[row][column]) {
            // -ve BC
            return;
        }
        isVisited[row][column] = true;
        findPath(row - 1, column, path + " U", maze, isVisited);
        findPath(row + 1, column, path + " D", maze, isVisited);
        findPath(row, column + 1, path + " R", maze, isVisited);
        findPath(row, column - 1, path + " L", maze, isVisited);
        isVisited[row][column] = false;
    }
}
