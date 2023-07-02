package com.jishnu.functions;

public class Armstrong {

    public static void main(String[] args) {
        int n =10000;
        int num = 1;

        while (num <= n){
            if (isArm(num)){
                System.out.println(num);
            }
            num++;
        }
    }

    public static boolean isArm(int num) {

        int number_of_digits = numberOfDigit(num);
        int dividend = num;
        int sum = 0;
        while (dividend > 0) {
            int remainder = dividend % 10;
            sum += (int)Math.pow(remainder, number_of_digits);
            dividend = dividend / 10;
        }

        return sum == num;
    }

    public static int numberOfDigit(int num) {
        int no_of_digits = 0;
        while (num > 0) {
            no_of_digits++;
            num = num / 10;
        }
        return no_of_digits;
    }
}
