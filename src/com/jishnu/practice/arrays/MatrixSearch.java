package com.jishnu.practice.arrays;

import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int columns = scn.nextInt();
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        int target = scn.nextInt();

        int currentrow = rows - 1;
        int currentcolumn = 0;

        while (currentcolumn <= columns - 1 && currentrow >= 0){
            if (matrix[currentrow][currentcolumn] == target) {
                System.out.println(1);
                return;
            }
            else if (matrix[currentrow][currentcolumn] > target){
                currentrow--;
            }else{
                currentcolumn++;
            }
        }

        System.out.println(0);
    }
}
