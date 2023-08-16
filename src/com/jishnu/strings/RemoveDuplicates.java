package com.jishnu.strings;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        StringBuilder sb = new StringBuilder(s);

        int index = 0;
        while (index < sb.length() - 1) {
            char curr = sb.charAt(index);
            char next = sb.charAt(index + 1);
            if (curr == next) {
                sb.deleteCharAt(index + 1);
            } else {
                index++;
            }
        }
        System.out.println(sb);
    }
}
