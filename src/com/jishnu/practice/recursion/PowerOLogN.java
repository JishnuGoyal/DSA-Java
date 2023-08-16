package com.jishnu.practice.recursion;

import java.util.Scanner;

public class PowerOLogN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long input = scn.nextLong();
        long power = scn.nextLong();
        System.out.println(calculate(input, power));
    }

    public static long calculate(long number, long power){
        if (power == 0) {
            return 1;
        }
        return number * calculate(number, power - 1);
    }
}
