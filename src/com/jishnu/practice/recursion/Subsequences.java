package com.jishnu.practice.recursion;

import java.util.Scanner;

public class Subsequences {
    public static int count = 0;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        findSubsequences("", input.length(), -1, input);
        System.out.println();
        System.out.println(count);
    }

    public static void findSubsequences(String path, int r, int last, String input) {
        if (r == 0) {
            count = count + 1;
            System.out.print(path + " ");
            return;
        }

        for (int i = last + 1; i < input.length(); i++) {
            findSubsequences(path, r - 1, i, input);
            findSubsequences(path + input.charAt(i), r - 1, i, input);
        }
    }
}
