package com.jishnu.practice.loops;

import java.util.Scanner;

public class Replace5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long input = scn.nextLong();
        long dividend = input;
        long placevalue = 0;
        long addendum = 0;

        do {
            long remainder = dividend % 10;
            if (remainder == 0) {
                addendum += 5 * (long)(Math.pow(10, placevalue));
            }
            placevalue++;
            dividend /= 10;
        }while (dividend > 0);

        System.out.println(input + addendum);
    }
}
