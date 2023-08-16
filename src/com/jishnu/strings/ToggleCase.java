package com.jishnu.strings;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
//        System.out.println("A" + (int)'A');
//        System.out.println("a" + (int)'a');
        // A - 65
        // a - 97
        int A = 'A';
        int Z = 'Z';
        int a = 'a';
        int z = 'z';

        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        StringBuilder sb = new StringBuilder(s);

        int index = 0;
        while (index < s.length()) {
            int current = sb.charAt(index);
            if (current > Z) { // small
                int differencefrom_a = current - a;
                char small = (char)(A + differencefrom_a);
                sb.setCharAt(index, small);
            } else {
                int differencefrom_A = current - A;
                char capital = (char)(a + differencefrom_A);
                sb.setCharAt(index, capital);
            }
            index++;
        }

        System.out.println(sb);
    }
}
