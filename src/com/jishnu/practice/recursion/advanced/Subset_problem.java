package com.jishnu.practice.recursion.advanced;

import java.util.Scanner;

public class Subset_problem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        target = scn.nextInt();
        findSubset("", 0, 0);
        System.out.println();
        System.out.print(count);

    }

    static int[] arr;
    static int target;
    static int count;

    public static void findSubset(String path, int last, int sum) {
        if (sum == target) {
            System.out.print(path + "  ");
            count = count + 1;
            return;
        }
        if (last == arr.length) {
            return;
        }
        if (sum > target) {
            return;
        }
        findSubset(path + arr[last] + " ", last + 1, sum + arr[last]);
        findSubset(path, last + 1, sum);
    }


}
