package com.jishnu.strings;

import java.util.Scanner;

public class OddEvenCharacter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        StringBuilder sb = new StringBuilder(s);

        int index = 0;
        while (index < s.length()) {
            char letter;
            if (index % 2 == 0) {
                letter = (char) ((int) s.charAt(index) + 1);
            } else {
                letter = (char) ((int) s.charAt(index) - 1);
            }
            sb.setCharAt(index, letter);
            index++;
        }

        System.out.println(sb);

    }
}
