package com.jishnu.practice.recursion;

import java.util.Scanner;

public class GenerateBinaryStrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tests = scn.nextInt();
        while (tests > 0) {
            String input = scn.next();
//            generate(input, new StringBuilder(""), input.length());
//            generate2(input, "", input.length(), 0);
            generate3(input, "", 0);
            tests--;
        }
    }

    public static void generate3(String input, String path, int index) {
        if (path.length() == input.length()) {
            System.out.print(path + " ");
            return;
        }

        if (index == input.length()) {
            return;
        }

        if (input.charAt(index) == '?') {
            generate3(input, path + "0", index + 1);
            generate3(input, path + "1", index + 1);
        } else {
            generate3(input, path + input.charAt(index), index + 1);
        }
    }

    public static void generate2(String input, String path, int targetLength, int index) {
        if (index == targetLength - 1) {
            return;
        }
        if (path.length() == targetLength) {
            System.out.print(path + " ");
            return;
        }
        if (input.isEmpty()) {
            return;
        }

        if (input.charAt(index) == '?') {
            generate2(input, path + "0", targetLength, index + 1);
            generate2(input, path + "1", targetLength, index + 1);
        } else {
            generate2(input, path + input.charAt(index), targetLength, index + 1);
        }

    }

    public static void generate(String input, StringBuilder path, int targetLength) {
        if (path.length() == targetLength) {
            System.out.print(path + " ");
            return;
        }
        if (input.isEmpty()) {
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '?') {
                generate(input.substring(i + 1), path.append("0"), targetLength);
                generate(input.substring(i + 1), path.append("1"), targetLength);
            } else {
                generate(input.substring(i + 1), path.append(input.charAt(i)), targetLength);
            }
            path = new StringBuilder();
        }
    }
}
