package com.jishnu.practice.recursion;

import java.util.Scanner;

public class CountWaysToClimbNthFloor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long input = scn.nextLong();
        climb(0, 0, input);
        System.out.println(count);
    }

    static long count = 0;

    public static void climb(long position, long last, long target) {

        if (position == target) {
            count = count + 1;
            return;
        }
        if (position > target) {
            return;
        }
        if (last != 2) {
            climb(position + 1, 1, target);
        }
        climb(position + 2, 2, target);
    }
}
