package com.jishnu.practice.loops;

import java.util.Scanner;

public class MurthalParantha {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int paranthas = scn.nextInt();
        int cooks = scn.nextInt();
        int[] arr = new int[cooks];

        for (int i = 0; i < cooks; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(findTime(paranthas, cooks, arr));
//
//        float workDoneInOneMinute = 0;
//        for (int i = 0; i < cooks; i++) {
//            workDoneInOneMinute += (float)Math.pow(arr[i], -1);
//        }
//
//        float timeForOneParantha = (float)Math.pow(workDoneInOneMinute, -1);
//
//        int time = (int)((float)(paranthas) * timeForOneParantha);
//        System.out.println(time);
    }

    private static int findTime(int paranthas, int cooks, int[] arr) {
        int index = 1;
        int left = paranthas;

        while (left >= 0) {
            for (int rank : arr) {
                int paranthasCooked = (int)(index * (float) Math.pow(index * rank, -1));
                left = left - paranthasCooked;
            }
            index++;
        }

        return index;
    }

    private static int paranthasTime(int paranthas, int cooks, int[] arr) {
        int minutes = 1;
        int total = 0;
        for (minutes = 1;; minutes++) {
            for (int rank : arr) {
                int paranthasCooked = (int)(minutes * (float) Math.pow(rank, -1));
                total += paranthasCooked;
            }

            if (total >= paranthas) return minutes;
            else total = 0;
        }

    }


}
