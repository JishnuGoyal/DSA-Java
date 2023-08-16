package com.jishnu.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numberofinputs = scn.nextInt();
        int[] arr = new int[numberofinputs];

        for(int i = 0; i < numberofinputs; i++){
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        int start = 0;
        int end = arr.length - 1;

        Arrays.sort(arr);

        while(start < end){
            if (arr[start] + arr[end] == target) {
                System.out.println(arr[start] + ", " + arr[end]);
                start++;
            }
            else if (arr[start] + arr[end] > target) end--;
            else if (arr[start] + arr[end] < target) start++;
        }
    }


}
