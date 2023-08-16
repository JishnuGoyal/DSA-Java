package com.jishnu.practice.recursion;

import java.util.Scanner;

public class NthTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        System.out.println(triangle(input));
    }

    public static int triangle(int n) {
        if (n == 1) {
            return 1;
        }
        return n + triangle(n - 1);
    }
}
