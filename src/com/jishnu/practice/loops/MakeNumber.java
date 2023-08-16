package com.jishnu.practice.loops;

import java.util.Scanner;

public class MakeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        long sum = 0;

        for (int i = 0; i < input; i++) {
            long num = scn.nextLong();
            sum += num * ((long)Math.pow(10, i));
        }

        System.out.println(sum);
    }
}
