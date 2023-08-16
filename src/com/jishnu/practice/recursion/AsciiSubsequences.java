package com.jishnu.practice.recursion;

import java.util.Scanner;

public class AsciiSubsequences {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        findSubsequences("", input.length(), input, -1);
        System.out.println();
        System.out.print(count);
    }

    public static int count = 0;

    public static void findSubsequences(String path, int r, String input, int last) {
        if (input.isEmpty()) {
            return;
        }
        if (r == 0) {
            System.out.print(path + " ");
            count = count + 1;
            return;
        }
        for (int i = last + 1; i < input.length(); i++) {
            findSubsequences(path, r - 1, input.substring(i), i);
            findSubsequences(path + input.charAt(i), r - 1, input.substring(i), i);
            findSubsequences(path + (int) input.charAt(i), r - 1, input.substring(i), i);
        }
    }
}
