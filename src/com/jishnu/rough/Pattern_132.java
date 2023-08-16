package com.jishnu.rough;

public class Pattern_132 {
    public static void main(String[] args) {
        int arr[] = {3, 1, 4, 2};

        int first = arr[0];
        int second = arr[1];
        int third = arr[arr.length - 1];

        int js = 1;
        int je = arr.length - 1;

        for (int j = js; j < je; j++) {
            second = arr[j];
            for (int i = 0; i < js; i++) {
                first = arr[i];
                if (second > first) {
                    break;
                }
            }

            for (int k = je; k < arr.length; k++) {
                third = arr[k];
                if (third > first && second > third) {
                    System.out.println(true);;
                }
            }
        }
    }
}
