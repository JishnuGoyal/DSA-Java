package com.jishnu.practice.recursion.advanced;

import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        findTwins(input, 0);
        System.out.println(count);
    }

    public static int count = 0;

    public static void findTwins(String input, int index) {
        if (index + 2 >= input.length()) {
            return;
        }

        if (input.charAt(index) == input.charAt(index + 2)) {
            count = count + 1;
            findTwins(input, index + 1);
        }
    }
}
