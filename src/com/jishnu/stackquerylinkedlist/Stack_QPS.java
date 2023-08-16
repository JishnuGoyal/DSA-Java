package com.jishnu.stackquerylinkedlist;

import java.util.Stack;

public class Stack_QPS {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        reverseStack(stack);
        printRecursively(stack);
    }

    // this function will recursively print the stack, without creating another stack.
    // this also uses extra space, but creates that space implicitly.
    private static void printRecursively(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        System.out.println(stack.peek());
        int ele = stack.peek();
        stack.pop();
        printRecursively(stack);
        stack.add(ele);
    }

    private static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int ele = stack.peek();
        stack.add(ele);
        reverseStack(stack);
        stack.pop();
    }
}
