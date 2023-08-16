package com.jishnu.strings;

public class PrintReverseSentence {
    public static void main(String[] args) {
        String str = "The sky is blue";

        int end = str.length() - 1;
        int start = str.length() - 1;

        while (start >= 0) {
            while (str.charAt(start) != ' ') {
                start--;
                if (start == 0) {
                    System.out.print(str.substring(start, end + 1));
                    return;
                }
            }
            System.out.print(str.substring(start + 1, end + 1));
            end = start;
            start--;
        }
    }
}
