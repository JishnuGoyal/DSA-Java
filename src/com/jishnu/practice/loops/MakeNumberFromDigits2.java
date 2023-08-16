package com.jishnu.practice.loops;

import java.util.Scanner;

public class MakeNumberFromDigits2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        long sum = 0;

        for (int i = 0; i < input; i++) {
            long num = scn.nextLong();
            sum = sum * 10 + num;
        }

        System.out.println(sum);
    }
}
