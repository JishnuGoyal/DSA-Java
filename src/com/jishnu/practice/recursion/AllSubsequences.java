package com.jishnu.practice.recursion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class AllSubsequences {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int testcases = scn.nextInt();
        while (testcases > 0) {
            helper();
            testcases--;
        }
    }

    public static void helper() {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        ArrayList<String> result = new ArrayList<>();
        makeChops("", -1, input.length(), input, result);
        result.sort(Comparator.naturalOrder());
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static void makeChops(String output, int last, int r, String input, ArrayList<String> result) {
        if (r == 0) {
            result.add(output);
            return;
        }
        for (int i = last + 1; i < input.length(); i++) {
            makeChops(output, i, r - 1, input, result);
            makeChops(output + input.charAt(i), i, r - 1, input, result);
        }
    }
}
