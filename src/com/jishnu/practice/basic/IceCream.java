package com.jishnu.practice.basic;

import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numberofinputs = scn.nextInt();
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < numberofinputs; i++) {
            int input = scn.nextInt();
            if (input < min) {
                min = input;
                index = i;
            }
        }

        System.out.println(index);
    }
}
