package com.jishnu.practice.loops;

import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int input = scn.nextInt();
            sum += input;
            if (sum > 0) System.out.println(input);
        }
    }
}
