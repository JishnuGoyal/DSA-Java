package com.jishnu.practice.strings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class AnagramPalindrome {
    public static void main(String[] args) {
        checkPalindrome();
    }

    public static void checkPalindrome() {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        ArrayList<Character> al = new ArrayList<Character>();
        // sort elements
        int index = 0;
        while (index < input.length()) {
            al.add(input.charAt(index));
            index++;
        }

        al.sort(Comparator.naturalOrder());
        System.out.println(al);

        // count elements
        ArrayList<Integer> countList = new ArrayList<>();
        char currentElement;
        int count = 1;
        char nextElement;

        for (int i = 0; i < al.size(); i++) {
            currentElement = al.get(i);
            if (i == al.size() - 1) {
                countList.add(count);
                break;
            }
            nextElement = al.get(i + 1);
            while (currentElement == nextElement) {
                count++;
                i++;
                currentElement = al.get(i);
                if (i == al.size() - 1) {
                    break;
                }
                nextElement = al.get(i + 1);
            }
            countList.add(count);
            count = 1;
        }
        System.out.println(countList);

        // based on count, judge whether palindrome or not.
        for (int i = 0; i < countList.size() - 1; i++) {
            if (countList.get(i) % 2 != 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
