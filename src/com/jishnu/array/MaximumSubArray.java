package com.jishnu.array;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {100, 200, -999999, 50, 5, 999999};
        kadence(arr);
    }

    // this finds the maximum sum subarray with just one loop
    public static void kadence(int[] arr) {
        int index = 0;
        int maxsum = 0;
        int sum = 0;
        while (index < arr.length) {
            sum += arr[index];
            if (sum < 0){
                sum = 0;
            }
            maxsum = Math.max(maxsum, sum);
            index++;
        }
        System.out.println(maxsum);
    }

    // this uses two loops
    public static void subArr(int[] arr) {
        int maxsum = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum > maxsum) maxsum = sum;
            }
        }
        System.out.println(maxsum);
    }
}
