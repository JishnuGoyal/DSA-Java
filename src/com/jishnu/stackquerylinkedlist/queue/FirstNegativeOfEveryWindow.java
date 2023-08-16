package com.jishnu.stackquerylinkedlist.queue;

public class FirstNegativeOfEveryWindow {
    public static void main(String[] args) {
        int[] arr = {-20, 10, -5, 4, 6, -9, -80, 60, 50};
        int k = 3;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                System.out.println(arr[i]);
                 i = i / k + 1;
            }
        }
    }
}
