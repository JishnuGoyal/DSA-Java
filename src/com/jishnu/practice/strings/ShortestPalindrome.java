package com.jishnu.practice.strings;

import java.util.Scanner;

public class ShortestPalindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();

        String latterHalf = input.substring(input.length() / 2, input.length());
        String reversedLatterHalf = reverse(latterHalf);
        String reversedFirstHalf = reverse(input.substring(0, input.length() / 2 + 1));
        if (input.contains(reversedLatterHalf)) {
            System.out.println(input);
        } else {
            System.out.println(input + reversedFirstHalf);
        }
    }

    public static String reverse(String input) {
        int index2 = input.length() - 1;
        StringBuilder output = new StringBuilder();
        while (index2 >= 0) {
            output.append(input.charAt(index2));
            index2--;
        }
        return output.toString();
    }
}
