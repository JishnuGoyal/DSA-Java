package com.jishnu.practice.recursion;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        invertedTriangle(input);
    }

    public static void invertedTriangle(int curr) {
        if (curr == 0) {
            return;
        }
        invertedTriangle(curr - 1);
        for (int i = 0; i < curr; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
