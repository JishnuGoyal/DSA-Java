package com.jishnu.practice.loops;

import java.util.Scanner;

public class SortZeroAndOne {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int zerocount = 0;

        for (int i = 0; i < size; i++) {
            int input = scn.nextInt();
            if (input == 0) zerocount++;
        }

        for (int i = 0; i < zerocount; i++) {
            System.out.print(0 + " ");
        }

        for (int i = 0; i < size - zerocount; i++) {
            System.out.print(1 + " ");
        }
    }
}
