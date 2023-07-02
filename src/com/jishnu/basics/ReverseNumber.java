package com.jishnu.basics;

public class ReverseNumber {
    public static void main(String[] args) {
        reverse(12345);
    }

    public static void reverse(int n) {
        int dividend = n;
        int reversed = 0;
        while (dividend > 0) {
            int remainder = dividend % 10;
            reversed = reversed * 10 + remainder;
            dividend = dividend / 10;
        }
        System.out.println(reversed);
    }
}
