package com.jishnu.practice.strings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        /* instead of changing the current string, make a new string */ compress();

//        Scanner scn = new Scanner(System.in);
//        String input = scn.nextLine();
//        StringBuilder sb = new StringBuilder(input);

//        int currCharStartIndex = 0;
//        int nextCharStartIndex = 0;
//        int currChar = sb.charAt(currCharStartIndex);
//        int nextChar = sb.charAt(nextCharStartIndex);
//        int currCharCount = 0;
//        while (currCharStartIndex <= sb.length()) {
//            while (nextChar == currChar) {
//                nextCharStartIndex++;
//                currCharCount++;
//                nextChar = sb.charAt(nextCharStartIndex);
//            }
//            if (currCharCount > 1) {
//                sb.replace(currCharStartIndex + 1, nextCharStartIndex, "" + currCharCount);
//            }
//            currCharStartIndex = nextCharStartIndex;
//        }
//
//        System.out.println(sb);

    }
    public static void compress() {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        ArrayList<Character> al = new ArrayList<Character>();
        String newstring = "";
        StringBuilder newStringBuilder = new StringBuilder(newstring);

        // count elements
        char currentElement;
        int count = 1;
        char nextElement;

        for (int i = 0; i < input.length(); i++) {
            currentElement = input.charAt(i);
            newStringBuilder.append(currentElement);
            if (i == input.length() - 1) {
                if (count > 1) newStringBuilder.append(count);
                break;
            }
            nextElement = input.charAt(i + 1);
            while (currentElement == nextElement) {
                count++;
                i++;
                currentElement = input.charAt(i);
                if (i == input.length() - 1) {
                    break;
                }
                nextElement = input.charAt(i + 1);
            }
            if (count > 1) newStringBuilder.append(count);
            count = 1;
        }
        System.out.println(newStringBuilder);
    }
}
