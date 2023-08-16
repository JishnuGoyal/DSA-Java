package com.jishnu.practice.recursion;

import java.util.Scanner;

public class OddEvenRecursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        helper(input);
    }

    public static void helper(int input) {
        int even = input;
        if (even % 2 != 0) even--;
        int odd = input;
        if (odd % 2 == 0) odd--;
        oddEven(odd, even);
    }

    private static void oddEven(int odd, int even) {
        if (odd >= 1) {
            System.out.println(odd);
        }
        if (odd < 1) {
            return;
        }
        oddEven(odd - 2, even - 2);
        if (even >= 2) {
            System.out.println(even);
        }
        if (even < 2) {
            return;
        }
    }
}
