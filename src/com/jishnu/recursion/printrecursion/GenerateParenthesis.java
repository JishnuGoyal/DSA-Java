package com.jishnu.recursion.printrecursion;

public class GenerateParenthesis {
    public static void main(String[] args) {
        generate(0, 0, "");
        generate2(0, 0, "", 4);
    }

    // number of parenthesis is hard coded
    public static void generate(int countOpen, int countClosed, String path) {
        if (countClosed + countOpen == 6) {
            System.out.println(path);
        } else if (countClosed + countOpen > 6) {
            return;
        }

        if (countOpen < 3) {
            generate(countOpen + 1, countClosed, path + "(");
        }
        if (countOpen > countClosed){
            generate(countOpen, countClosed + 1, path + ")");
        }
    }


    // number of parenthesis can be variable
    public static void generate2(int countOpen, int countClosed, String path, int numberOfParenthesis) {
        if (countClosed + countOpen == numberOfParenthesis * 2) {
            System.out.println(path);
        } else if (countClosed + countOpen > numberOfParenthesis * 2) {
            return;
        }

        if (countOpen < numberOfParenthesis) {
            generate2(countOpen + 1, countClosed, path + "(", numberOfParenthesis);
        }
        if (countOpen > countClosed){
            generate2(countOpen, countClosed + 1, path + ")", numberOfParenthesis);
        }
    }

}
