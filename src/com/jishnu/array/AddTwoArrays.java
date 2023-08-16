package com.jishnu.array;

import java.util.ArrayList;

public class AddTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 7, 8, 2};
        int[] arr2 = {4, 6, 1};

        System.out.println(sum(arr1, arr2));
    }

    public static ArrayList<Integer> sum(int[] arr1, int[] arr2) {
        ArrayList<Integer> a = new ArrayList<>();
        int size1 = arr1.length;
        int size2 = arr2.length;
        int iterations = Math.min(size1, size2);
        int carry = 0;

        while (iterations > 0) {

            int result = arr1[size1 - 1] + arr2[size2 - 1];
            if (result > 10) {
                a.add(0, result % 10 + carry);
                carry = 1;
            } else {
                a.add(0, result);
                carry = 0;
            }

            iterations--;
            size1--;
            size2--;
        }
        return a;
    }
}
