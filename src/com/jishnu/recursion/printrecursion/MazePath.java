package com.jishnu.recursion.printrecursion;

public class MazePath {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
//        maze(0, 0, "");
        maze2(0, 0, "", arr);
    }

    public static void maze(int countRight, int countDown, String path) {
        if (countDown + countRight == 4) {
            System.out.println(path);
        } else if (countDown + countRight > 4) {
            return;
        }

        if (countRight < 2) {
            maze(countRight + 1, countDown, path + " R");
        }
        if (countDown < 2) {
            maze(countRight, countDown + 1, path + " D");
        }
    }

    public static void maze2(int countRight, int countDown, String path, int[][] arr) {
        if (countDown + countRight == arr[0].length - 1 + arr.length - 1) {
            System.out.println(path);
            System.out.println(""+ countDown + ", " + countRight);
        } else if (countDown + countRight > 4) {
            return;
        }

        if (countRight < arr[0].length) {
            maze(countRight + 1, countDown, path + " R");
        }
        if (countDown < arr.length) {
            maze(countRight, countDown + 1, path + " D");
        }
    }


}
