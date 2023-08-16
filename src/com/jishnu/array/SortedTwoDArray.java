package com.jishnu.array;

// in a 2d array which is sorted both in columns and rows, search a target element
public class SortedTwoDArray {
    public static void main(String[] args) {
        int[][] mat = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 28, 37, 48},
                {29, 33, 39, 50}
        };

        int target = 41;

        int leftbound = 0; //column number
        int lowerbound = mat.length -1; // row number

        while((leftbound <= mat[0].length - 1) && lowerbound >= 0){
            if (target == mat[lowerbound][leftbound]) {
                System.out.println("found");
                return;
            }
            if (target > mat[lowerbound][leftbound]) leftbound++;
            else if (target < mat[lowerbound][leftbound]) lowerbound--;
        }

        System.out.println("not found");
    }
}
