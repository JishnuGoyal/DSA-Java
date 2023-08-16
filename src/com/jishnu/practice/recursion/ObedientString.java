package com.jishnu.practice.recursion;

import java.util.Scanner;

public class ObedientString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        // initialize this char by 'a'. This doesn't make a difference because isObedient checks if the char at 0th index
        // was 'a' anyway.
        isObedient(input, 0, 'a');
    }

    public static void isObedient(String input, int index, char last) {
        if (input.charAt(0) != 'a') {
            System.out.println(false);
            return;
        }

        if(index >= input.length()) {
            System.out.println(true);
            return;
        }

        if (input.substring(index).isEmpty()) {
            System.out.println(true);
            return;
        }

        // these conditions should be checked if the last element parsed was 'a'.
        if (last == 'a') {
            if (input.charAt(index) == 'a') {
                isObedient(input, index + 1, 'a');
            } else if (input.charAt(index) == 'b' && input.charAt(index + 1) == 'b') {
                isObedient(input, index + 2, 'b');
            } else { // element is something other than 'a' or 'bb'
                System.out.println(false);
                return;
            }
        }
        // these conditions should be checked if bb occurred last in the parsed string.
        else if (last == 'b') {
            if (input.charAt(index) == 'a') {
                isObedient(input, index + 1, 'a');
            } else { // element is something other than 'a' or 'bb'
                System.out.println(false);
                return;
            }
        }
    }
}
