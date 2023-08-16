package com.jishnu.strings;

import java.util.Scanner;

public class DifferenceAscii {
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        String s = scn.nextLine();
//        StringBuilder sb = new StringBuilder(s);
//
//        int index = 0;
//        while (index < sb.length()) {
//            if (index == sb.length()) return;
//            int difference = sb.charAt(index + 1) - sb.charAt(index);
//            sb.insert(index + 1, difference);
//            index = index + 2;
//        }
//
//        System.out.println(sb);
//    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String answer = "";
        int index = 1;
        while (index < s.length()) {
            int difference = s.charAt(index) - s.charAt(index - 1);
            answer += (s.charAt(index - 1));
            answer += (difference);
            answer += (s.charAt(index));

            index+=2;
        }

        System.out.println(answer);
    }
}
