package com.jishnu.practice.stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tests = scn.nextInt();
        while (tests > 0) {
            int size = scn.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = scn.nextInt();
            }
            nextGreater(arr);
            tests--;
        }
    }

    public static void nextGreater(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int nextgreater = -1;


        for (int i = arr.length - 1; i >= 0 ; i--) {
            if (arr[i] > nextgreater){
                nextgreater = arr[i];
                stack.add(-1);
            } else {
                stack.add(nextgreater);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "," + stack.pop());
        }
    }
}
