package com.jishnu.practice.arrays;

import java.util.Scanner;

public class SpiralPrintArrayAnticlockwise {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int columns = scn.nextInt();
        int[][] arr = new int[rows][columns];
        int number_of_elements = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = scn.nextInt();
                number_of_elements++;
            }
        }

        int column_start = 0;
        int row_start = 0;
        int row_end = rows - 1;
        int column_end = columns - 1;
        int count = 0;
        while (column_end >= column_start && row_end >= row_start) {
            // print first column
            for (int i = row_start; i <= row_end; i++) {
                System.out.print(arr[i][column_start] + ", ");
                count++;
                if (number_of_elements == count) {
                    System.out.println("END");
                    return;
                }
            }

            // print last row
            for (int i = column_start + 1; i <= column_end; i++) {
                System.out.print(arr[row_end][i] + ", ");
                count++;
                if (number_of_elements == count) {
                    System.out.println("END");
                    return;
                }
            }

            // print last column
            for (int i = row_end - 1; i >= row_start; i--) {
                System.out.print(arr[i][column_end] + ", ");
                count++;
                if (number_of_elements == count) {
                    System.out.println("END");
                    return;
                }
            }

            // print first row
            for (int i = column_end - 1; i >= column_start + 1; i--) {
                System.out.print(arr[row_start][i] + ", ");
                count++;
                if (number_of_elements == count) {
                    System.out.println("END");
                    return;
                }
            }
            row_end--;
            row_start++;
            column_end--;
            column_start++;
        }

    }
}
