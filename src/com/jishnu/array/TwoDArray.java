package com.jishnu.array;

import java.sql.SQLOutput;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count;
                count++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("\t" + arr[i][j]);
            }
            System.out.println();
        }

        int[][] arr2 = {
                {11,12,13,14},
                {21,22,23,24},
                {31,32,33,34},
                {41,42,43,44}
        };
        wave(arr2);

    }

    public static void wave(int[][] arr) {
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                int index = 0;
                if (j % 2 == 0) index = i;
                else index = 3 - i;
                System.out.print("\t"+  arr[index][j]);
            }
            System.out.println();
        }
    }


}
