package com.jishnu.practice.loops;

import java.util.Scanner;

public class BostonNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        int dividend = input;
        int divisor = 2;
        int quotient = 100;
        int remainder;
        int factorSum = 0;
        int digitSum = 0;

        // find factor sum
        while (quotient > 1) {
            remainder = dividend % divisor;
            if (remainder == 0) { // is a factor
                quotient = dividend / divisor;
                factorSum += divisor;
                dividend = quotient;
            } else {
                divisor++;
            }
        }


        digitSum = findDigitSum(input);
        factorSum = findDigitSum(factorSum);

        // compare sums
        if (digitSum == factorSum) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static int findDigitSum(int number) {
        if (number < 10) return number;
        int sum = 0;
        while (number > 0) {
            int remainder = number % 10;
            sum += remainder;
            number /= 10;
        }

        if (sum < 10) return sum;
        else return findDigitSum(sum);
    }
}
