package com.jishnu.practice.loops;

import java.util.Scanner;

public class SortingInlinearTime {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        sortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortColors(int[] nums) {
        // Write your code here
        int countzero = 0;
        int countone = 0;
        int counttwo = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) countzero++;
            else if (nums[i] == 1) countone++;
            else if (nums[i] == 2) counttwo++;
        }

        update(0, countzero, nums, 0);
        update(countzero, countzero + countone, nums, 1);
        update(countone + countzero, countone + countzero + counttwo, nums, 2);
    }

    public static void update(int start, int end, int[] arr, int num) {
        for (int i = start; i < end; i++) {
            arr[i] = num;
        }
    }
}
