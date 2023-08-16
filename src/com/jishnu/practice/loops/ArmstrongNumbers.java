package com.jishnu.practice.loops;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        System.out.println(isArmstrong(input));
    }

    public static boolean isArmstrong(int n) {
        int dividend = n;
        int sum = 0;
        int numberofdigits = countDigits(dividend);

        while (dividend > 0) {
            int remainder = dividend % 10;
            sum += Math.pow(remainder, numberofdigits);
            dividend /= 10;
        }

        return sum == n;
    }

    private static int countDigits(int dividend) {
        int count = 0;
        while (dividend > 0) {
            dividend /= 10;
            count++;
        }
        return count;
    }
}
