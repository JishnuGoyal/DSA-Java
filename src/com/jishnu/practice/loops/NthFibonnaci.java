package com.jishnu.practice.loops;

import java.util.Scanner;

public class NthFibonnaci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int first = 0;
        int second = 1;
        int third = 0;

        int count = 2;
        while (count <= n) {
            third = first + second;
            first = second;
            second = third;
            count++;
        }

        System.out.println(third);
    }
}
