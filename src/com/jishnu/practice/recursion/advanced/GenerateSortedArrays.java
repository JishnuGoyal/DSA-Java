package com.jishnu.practice.recursion.advanced;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class GenerateSortedArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        arr1 = new int[n1];
        arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            arr2[i] = scn.nextInt();
        }

        pickNumber("", 0, 0, false, Integer.MIN_VALUE);


        // this order of output is dictionary order. It cannot be achieved using the
        // changing the order of function calls in recursion.
        list.sort(Comparator.naturalOrder());
        for (String s: list){
            System.out.println(s);
        }

    }

    static int[] arr1;
    static int[] arr2;
    static ArrayList<String> list = new ArrayList<>();

    public static void pickNumber(String path, int index1, int index2, boolean lastFromA, int last) {
        if ((index1 >= arr1.length || index2 >= arr2.length) && !lastFromA) {
//            System.out.println(path);
            list.add(path);
            return;
        }
        if (!lastFromA && index1 < arr1.length) {
            if ( arr1[index1] > last) {
                pickNumber(path + arr1[index1] + " ", index1 + 1, index2, true, arr1[index1]);
            }
            pickNumber(path, index1 + 1, index2, false, last);
        } else if (index2 < arr2.length){
            if ( arr2[index2] > last) {
                pickNumber(path + arr2[index2] + " ", index1, index2 + 1, false, arr2[index2]);
            }
            pickNumber(path, index1, index2 + 1, true, last);
        }
    }
}
