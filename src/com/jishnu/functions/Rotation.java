package com.jishnu.functions;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int number_of_rotations = scn.nextInt();
        int actual_number_of_rotations = number_of_rotations % numberOfDigits(num);
        while(actual_number_of_rotations > 0){
            num = rotate(num);
            actual_number_of_rotations--;
        }
        System.out.print(num);
    }

    public static int rotate(int num) {
        int lastDigit = num % 10;
        int newNumber = num / 10 + (lastDigit * (int)Math.pow(10, numberOfDigits(num) - 1));
        return newNumber;
    }

    public static int numberOfDigits(int num) {
        int no_of_digits = 0;
        while (num > 0) {
            no_of_digits++;
            num = num / 10;
        }
        return no_of_digits;
    }
}
