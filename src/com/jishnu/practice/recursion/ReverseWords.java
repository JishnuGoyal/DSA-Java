package com.jishnu.practice.recursion;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        System.out.println(reverseWords(input, "").trim());
    }

    public static String reverseWords(String input, String output) {
        if (input.isEmpty()) {
            return output;
        }
        int indexOfLastSpace = input.lastIndexOf(" "); // what if this is -1
        if (indexOfLastSpace != -1) {
            String lastWord = input.substring(indexOfLastSpace + 1);
            return reverseWords(input.substring(0, indexOfLastSpace), output + " " + lastWord);
        } else {
            return reverseWords("", output + " " + input);
        }
    }
}
