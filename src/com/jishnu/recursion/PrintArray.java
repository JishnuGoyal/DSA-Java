package com.jishnu.recursion;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        printFromDifferentLogic(arr, arr.length - 1);
    }

//    public static int max(int[] arr, int index, int max) {
//        if (index == arr.length) return max;
//
//
//    }

    public static void printFromMid(int[] arr, int mid) {

    }

    public static void printFromDifferentLogic(int[] arr, int end) {
        if (end < 0) return;
        printFromDifferentLogic(arr, end - 1);
        System.out.println(arr[end]);
    }

    public static void print(int[] arr, int start) {
        if (start == arr.length) return;
        System.out.println(arr[start]);
        print(arr, start + 1);
    }
}
