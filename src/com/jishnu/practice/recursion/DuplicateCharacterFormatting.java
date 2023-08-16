package com.jishnu.practice.recursion;

public class DuplicateCharacterFormatting {
    public static void main(String[] args) {
        format("", "lll", 0);
    }

    public static void format(String path, String input, int index) {
        if (index == input.length() - 1) {
            path += input.charAt(index);
            System.out.println(path);
            return;
        }

        if (input.charAt(index) == input.charAt(index + 1)) {
            path += input.charAt(index) + "*";
            format(path, input, index + 1);
        } else {
            format(path + input.charAt(index), input, index + 1);
        }
    }
}
