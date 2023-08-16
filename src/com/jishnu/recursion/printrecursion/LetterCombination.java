package com.jishnu.recursion.printrecursion;

public class LetterCombination {
    public static void main(String[] args) {

    }

    public static String options(char number) {
        if (number == '2') return "abc";
        else if (number == '3') return "def";
        else if (number == '4') return "ghi";
        else if (number == '5') return "jkl";
        else if (number == '6') return "mno";
        else if (number == '7') return "pqrs";
        else if (number == '8') return "tuv";
        else if (number == '9') return "wxyz";
        return "";
    }

    public static void findCombinations(String input, int length, String output) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }
        int iterations = options(input.charAt(0)).length();
        while(iterations > 0){
//            findCombinations(input.subSequence(1), output+next);
        }


    }


}
