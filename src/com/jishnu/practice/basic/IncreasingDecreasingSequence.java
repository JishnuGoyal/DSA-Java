package com.jishnu.practice.basic;

import java.util.Scanner;

public class IncreasingDecreasingSequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int increasing = 0;

        int previous = scn.nextInt();
        int next = scn.nextInt();
        if (next > previous) increasing = 1;

        for (int i = 0; i < n - 2; i++) {
            previous = next;
            next = scn.nextInt();
            // increasing then decreasing
            if (next < previous && increasing == 1){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
