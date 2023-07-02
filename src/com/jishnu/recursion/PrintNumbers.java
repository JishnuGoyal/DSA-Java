package com.jishnu.recursion;

import java.util.ArrayList;
import java.util.Objects;

public class PrintNumbers {
    public static void main(String[] args) {
        System.out.println(remove_apple("acappledmdk", ""));
//        int[] arr = {1, 2, 3, 4, 4, 3};
//        System.out.println(countNumbers(arr, 0, new ArrayList<Integer>(), 3));
    }

    public static String remove_apple(String input, String output) {
        if (input.isEmpty()) return output;
        if (input.startsWith("apple")) {
            return remove_a(input.substring(5), output);
        } else {
            output += input.charAt(0);
        }

        return remove_a(input.substring(1), output);
    }

    public static String remove_a(String input, String output) {
        if (input.isEmpty()) return output;
        if (input.charAt(0) != 'a') output += input.charAt(0);

        return remove_a(input.substring(1), output);
    }

    public static void print(int n) {
        if (n <= 0) return;
        System.out.print(n);
        print(n - 1);
        System.out.print(n);
    }

    public static int factorial(int n) {
        if (n <= 1) return n;
        return n * factorial(n - 1);
    }

    public static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumOfDigits(n / 10);
    }

    public static int productOfDigits(int n) {
        if (n % 10 == n) return n;
        return n % 10 * productOfDigits(n / 10);
    }

    public static int reverseNumber(int reversed, int number) {
        if (number == 0) return reversed;
        reversed = reversed * 10 + number % 10;
        return reverseNumber(reversed, number / 10);
    }

    public static int countZeros(int n, int count) {
        if (n / 10 == 0) return count;
        if (n % 10 == 0) count++;
        return countZeros(n / 10, count);
    }

    public static boolean isArraySorted(int[] arr, int index) {
        if (index == arr.length - 1) return true;
        if (arr[index] > arr[index + 1]) return false;
        return isArraySorted(arr, ++index);
    }

    public static ArrayList<Integer> countNumbers(int[] arr, int index, ArrayList<Integer> list, int target) {
        if (index == arr.length - 1) {
            if (arr[index] == target) {
                list.add(index);
            }
            return list;
        }
        if (arr[index] == target) list.add(index);
        return countNumbers(arr, index + 1, list, target);
    }
}
