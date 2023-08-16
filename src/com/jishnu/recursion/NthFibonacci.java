package com.jishnu.recursion;

public class NthFibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(0));
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 0) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
