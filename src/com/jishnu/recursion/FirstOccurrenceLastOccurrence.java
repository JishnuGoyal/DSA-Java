package com.jishnu.recursion;

public class FirstOccurrenceLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 10};
//        firstOccurrence(arr, 50, 0);
//        lastOccurrence(arr, 10, 2);
//        allOccurrence(arr, 10, 0);
    }

//    public static void allOccurrence(int[] arr, int target, int start, int total) {
//        if(start == arr.length) {
//            System.out.println(-1);
//            return;
//        } else if (arr[start] == target) {
//            System.out.println(start);
//        }
//        allOccurrence(arr, target, start + 1);
//    }

    public static void lastOccurrence(int[] arr, int target, int end) {
        if(end < 0) {
            System.out.println(-1);
            return;
        } else if (arr[end] == target) {
            System.out.println(end);
            return;
        }
        lastOccurrence(arr, target, end - 1);
    }

    public static void firstOccurrence(int[] arr, int target, int start) {
        if(start == arr.length) {
            System.out.println(-1);
            return;
        } else if (arr[start] == target) {
            System.out.println(start);
            return;
        }
        firstOccurrence(arr, target, start + 1);
    }
}
