package com.jishnu.practice.loops;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int dividend = scn.nextInt();
        int divisor = 2;
        int quotient = 100;
        int remainder;
        int lastAnswer = 0;

        while (quotient > 1) {
            remainder = dividend % divisor;
            if (remainder == 0) { // is a factor
                quotient = dividend / divisor;
                if (lastAnswer != divisor){
                    System.out.print(divisor+ " ");
                }
                lastAnswer = divisor;
                dividend = quotient;
            } else{
                divisor++;
            }
        }
    }
}
