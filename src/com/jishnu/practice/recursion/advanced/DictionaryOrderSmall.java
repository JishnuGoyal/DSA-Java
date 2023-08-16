package com.jishnu.practice.recursion.advanced;

import java.util.Arrays;
import java.util.Scanner;

public class DictionaryOrderSmall {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        s = scn.nextLine();
        for (int i = 0; i < s.length(); i++) {
            numberOfLetters[(int) s.charAt(i) - 'a']++;
        }
        findNext("");
    }

    static String s = "cab";
    static int[] numberOfLetters = new int[26];

    public static void findNext(String path) {
        if (path.length() == s.length()) {
            if (s.compareTo(path) < 0) {
                System.out.println(path);
            }
//            } else {
//                System.exit(0);
//            }

//            System.out.println(path);
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (numberOfLetters[ch - 'a'] > 0) {
                numberOfLetters[ch - 'a']--;
                findNext(path + ch);
                numberOfLetters[ch - 'a']++;
            }
        }
    }
}
