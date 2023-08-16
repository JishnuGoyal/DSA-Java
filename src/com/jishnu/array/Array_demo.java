package com.jishnu.array;

public class Array_demo {
    public static void main(String[] args) {
        int[][] arr = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}
        };
        manipulateArray(arr);
    }

    public static void manipulateArray(int[][] arr) {
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                int index = i;
                if (j % 2 != 0) {
                    index = 3 - i;
                }
                System.out.print(arr[index][j]+ " ");
            }
            System.out.println();
        }
    }
}
