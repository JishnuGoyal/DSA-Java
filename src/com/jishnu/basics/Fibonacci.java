package com.jishnu.basics;

// print n-th fibonacci number
public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(5);
    }

    public static void fibonacci(int n) {
        // print first n fibonacci numbers:
        int first = 0;
        int second = 1;
        int third = 0;
        int count = 0;

        if (n == 1) System.out.println(second);

        while (count < n - 1) {
            third = first + second;
            first = second;
            second = third;
            count++;
        }

        System.out.println(third);
    }
}
