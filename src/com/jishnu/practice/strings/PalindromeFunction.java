package com.jishnu.practice.strings;

import java.util.Scanner;

public class PalindromeFunction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.nextLine();
        int length = string.length();

        int start = 0;
        int end = length - 1;

        while(start < end){
            if (string.charAt(start) != string.charAt(end)) {
                System.out.println("False");
                return;
            }
            start++;
            end--;
        }
        System.out.println("True");

    }
}
