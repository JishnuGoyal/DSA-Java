package com.jishnu.array;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int numberofrotations = 100;

        rotate(arr, numberofrotations % arr.length); // important
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void rotate(int arr[], int r) {
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, r - 1);
        reverse(arr, r, arr.length - 1);
    }

    public static void reverse(int arr[], int start, int end) {
        int index1 = start; // index to start reversing from
        int index2 = end; // index till which reverse should be done
        while (index1 < index2) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
            index1++;
            index2--;
        }
    }

}
