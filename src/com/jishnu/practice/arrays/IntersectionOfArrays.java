package com.jishnu.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numberofinputs = scn.nextInt();
        int[] arr1 = new int[numberofinputs];
        int[] arr2 = new int[numberofinputs];
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < numberofinputs; i++) {
            arr1[i] = scn.nextInt();
        }

        for (int i = 0; i < numberofinputs; i++) {
            arr2[i] = scn.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int pointer1 = 0;
        int pointer2 = 0;
        while ((pointer1 <= (arr1.length - 1)) && (pointer2 <= (arr2.length - 1))) {
            if (arr1[pointer1] == arr2[pointer2]){
                arrayList.add(arr1[pointer1]);
                pointer1++;
                pointer2++;
            }
            else if (arr1[pointer1] > arr2[pointer2]){
                pointer2++;
            }
            else {
                pointer1++;
            }
        }

        System.out.println(arrayList);
    }
}
