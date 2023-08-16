package com.jishnu.practice.recursion;

import java.util.Scanner;

public class WhatIsInTheParenthesis {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        find("", 0, false, s);
    }

    public static void find(String path, int index, boolean isRecording, String input) {

        if (index == input.length() - 1) {
            System.out.println(path);
            return;
        }
        if (input.charAt(index) == '(') {
            isRecording = true;
            index = index + 1;
        }
        if (input.charAt(index) == ')'){
            isRecording = false;
        }

        if (isRecording){
            path += input.charAt(index);
            find(path, index + 1, isRecording, input);
        }
        else {
            find(path, index + 1, isRecording, input);
        }
    }
}
