package com.jishnu.practice.recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        System.out.println(factorial(input));
    }

    public static int factorial(int fact) {
        if (fact == 1 || fact == 0){
            return 1;
        }
        return fact * factorial(fact - 1);
    }
}
