package com.jishnu.loops;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t>0){
            isAllowed(scn.nextInt());
            t--;
        }

    }

    public static void isAllowed(int num) {

        int dividend = num;
        int sumEven = 0;
        int sumOdd = 0;
        while (dividend > 0) {
            int currNum = dividend % 10;
            if (currNum % 2 == 0) sumEven += currNum;
            else sumOdd += currNum;

            dividend /= 10;
        }

        if (sumEven % 4 == 0 || sumOdd % 3 == 0) System.out.print("Yes");
        else System.out.print("No");
    }
}
