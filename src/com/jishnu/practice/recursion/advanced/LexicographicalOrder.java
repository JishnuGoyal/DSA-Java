package com.jishnu.practice.recursion.advanced;

import java.util.Scanner;

public class LexicographicalOrder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int limit = scn.nextInt();
        printNextLexico(0, limit);
    }

    public static void printNextLexico(int num, int limit) {
        if (num > limit) {
            return;
        }

        if (num == 0) {
            System.out.print(0 + " ");
            for (int i = 1; i <= 9; i++) {
                printNextLexico(num * 10 + i, limit);
            }
            return;
        }

        System.out.print(num + " ");

        for (int i = 0; i <= 9; i++) {
            printNextLexico(num * 10 + i, limit);
        }
    }


//    public static void printNext(int toPrint, int limit) {
//        if (toPrint > limit) {
//            return;
//        }
//
//        System.out.print(toPrint + " ");
//        if (toPrint == 0) {
//            printNext(1, limit);
//            return;
//        }
//
//        printNext(toPrint * 10, limit);
//        printNext(toPrint + 1, toPrint * 10 + 9);
//    }
}
