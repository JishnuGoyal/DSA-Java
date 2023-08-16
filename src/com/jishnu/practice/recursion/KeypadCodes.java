package com.jishnu.practice.recursion;

import java.util.Scanner;

public class KeypadCodes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        findCodes(input, "");
        System.out.println();
        System.out.println(count);
    }

    public static int count = 0;

    public static String getAlphabets(char number){
        switch (number) {
            case '1': return "abc";
            case '2': return "def";
            case '3': return "ghi";
            case '4': return "jkl";
            case '5': return "mno";
            case '6': return "pqrs";
            case '7': return "tuv";
            case '8': return "wx";
            case '9': return "yz";
        }
        return "";
    }

    public static void findCodes(String numbers, String path) {
        if (numbers.isEmpty()) {
            System.out.print(path + " ");
            count = count + 1;
            return;
        }

        String alphabets = getAlphabets(numbers.charAt(0));

        for (int i = 0; i < alphabets.length(); i++) {
            findCodes(numbers.substring(1), path + alphabets.charAt(i));
        }

    }
}
