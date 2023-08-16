package com.jishnu.practice.recursion;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        String input = scn.nextLine();
        System.out.println(reverse2("abcd", ""));
    }

    public static String reverse2(String input, String output) {
        if (input.isEmpty()) {
            return output;
        }
        String lastElementOfCurrentString = input.substring(input.length() - 1);
        return reverse2(
                input.substring(0, input.length() - 1), output + lastElementOfCurrentString
        );
    }
}
