package com.jishnu.rough;

public class Permutation {
    public static void main(String[] args) {
        pickBoxes("", 0,new boolean[4], 4);
    }

    public static void pickBoxes(String path, int countPicked, boolean[] isPicked, int total) {
        if (countPicked == 2) {
            System.out.println(path);
            return;
        }
        for (int i = 0; i < total; i++) {
            if (!isPicked[i]){
                isPicked[i] = true;
                pickBoxes(path + "b" + i, countPicked + 1, isPicked, total);
                isPicked[i] = false;
            }
        }
    }
}
