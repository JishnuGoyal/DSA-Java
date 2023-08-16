package com.jishnu.practice.strings;

import java.util.Scanner;

public class ReplacePi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tests = scn.nextInt();
        while (tests > 0) {
            replace();
            tests--;
        }
    }

    public static void replace() {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        StringBuilder sb = new StringBuilder(input);

        int index = sb.indexOf("pi");
        while (index != -1) {
            sb.replace(index, index + 2, "3.14");
            index = sb.indexOf("pi");
        }
        System.out.println(sb);
    }
}
