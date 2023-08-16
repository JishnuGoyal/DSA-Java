package com.jishnu.stackquerylinkedlist;

public class StackUsingArray {
    static int[] arr;
    static int tos; // top of stack

    public StackUsingArray(){
        this(5);
    }

    public StackUsingArray(int cap) {
        tos = -1;
        arr = new int[cap];
    }

    public static void add(int[] stack, int ele) {
        stack[tos + 1] = ele;
        tos++;
        print(stack);
    }

    public static void pop(int[] stack) {
        if (tos != -1)
            tos--;
        print(stack);
    }

    public static void print(int[] stack) {
        for (int i = 0; i <= tos; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

}
