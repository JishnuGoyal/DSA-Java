package com.jishnu.practice.recursion.advanced;

import java.util.Scanner;

public class GenerateParenthesis {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int total = scn.nextInt();
        generate("", total, 0, 0);
    }

    public static void generate(String path, int total, int totalOpen, int totalClosed) {
        if (totalOpen + totalClosed == total) {
            System.out.println(path);
            return;
        }

        if (totalOpen > totalClosed) {
            generate(path + ")", total, totalOpen, totalClosed + 1);
        }

        if (totalOpen < total / 2) {
            generate(path + "(", total, totalOpen + 1, totalClosed);
        }

    }
}
