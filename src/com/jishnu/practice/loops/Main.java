package com.jishnu.practice.loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        int limit = scn.nextInt();
        limit = input * limit;
        int currentnum = 0;
        while (true){
            currentnum += input;
            if (currentnum <= limit){
                System.out.println(currentnum);
            } else {
                return;
            }
        }
    }
}
