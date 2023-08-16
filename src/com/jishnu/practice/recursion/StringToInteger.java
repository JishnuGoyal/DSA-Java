package com.jishnu.practice.recursion;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        System.out.println(convert(0, input));

    }

    public static int convert(int integer, String string) {
        if (string.isEmpty()){
            return integer;
        }
        int add = integer * 10 + charToInt(string.charAt(0));
        return convert(add, string.substring(1));
    }

    public static int charToInt(char ch) {
        switch (ch) {
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                return 0;
        }
    }
}
