package com.jishnu.practice.loops;

import java.util.Scanner;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int testcases = scn.nextInt();
        while (testcases > 0) {
//            String input = scn.nextLine();
            longestPalindromeSubstring();
            testcases--;
        }
    }


    public static void longestPalindromeSubstring() {
        Scanner scn = new Scanner(System.in);
        String input = scn.next();
        int maxLen = Integer.MIN_VALUE;
        String longestSubstring = "";
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String substring = input.substring(i, j);
                if (isPalindrome(substring) && substring.length() > maxLen) {
                    maxLen = substring.length();
                    longestSubstring = substring;
                }
            }
        }

        System.out.println(longestSubstring);
        System.out.println(maxLen);

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

