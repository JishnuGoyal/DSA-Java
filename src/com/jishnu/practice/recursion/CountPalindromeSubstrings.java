package com.jishnu.practice.recursion;

import java.util.Scanner;

public class CountPalindromeSubstrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int testcases = scn.nextInt();
        while (testcases > 0) {
            String input = scn.nextLine();
            longestPalindromeSubstring(input);
            testcases--;
        }
//        findSubstrings(input, "");
//        System.out.println("count: " + count);
    }


    public static void longestPalindromeSubstring(String input) {
        int maxLen = Integer.MIN_VALUE;
        String longestSubstring = "";
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 2; j <= input.length(); j++) {
                String substring = input.substring(i, j);
                if (isPalindrome(substring) && substring.length() > maxLen) {
                    maxLen = substring.length();
                    longestSubstring = substring;
                }
            }
        }

        System.out.println(longestSubstring);
    }

    public static int count = 0;


    /** Using a recursive function to find possible substrings isn't reliable. */
    public static void findSubstrings(String table, String path) {
        System.out.println("table: " + table);
        if (table.isEmpty()) {
            // check palin and count
            return;
        }
        for (int i = 1; i <= table.length(); i++) {
            String piece = table.substring(0, i);

            if (/*piece.length() >= 2 &&*/ isPalindrome(piece)) {
//                System.out.println("tasty piece: " + piece);
                count = count + 1;
            }
            String remain = table.substring(i);
            findSubstrings(remain, piece);
        }
    }

    public static boolean isPalindrome(String input) {
        int start = 0;
        int last = input.length() - 1;

        while (start < last) {
            if (input.charAt(start) != input.charAt(last)) {
                return false;
            }
            start++;
            last--;
        }
        return true;
    }

}
