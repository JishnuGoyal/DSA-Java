package com.jishnu.rough;

public class Combination {
    public static void main(String[] args) {
//        pickBoxes(2, "", -1, 4);
        combi(2, "", 0, 4 );
    }

    public static void pickBoxes(int r, String path, int lastPicked, int total) {
        if (r == 0) {
            System.out.println(path);
            return;
        }

        for (int i = lastPicked + 1; i < total; i++) {
            pickBoxes(r - 1, path + "b" + i, i, total);
        }
    }

    public static void combi(int r, String path, int curr, int total) {
        if (r == 0){
            System.out.println(path);
            return;
        }
        if (curr == total){
            return;
        }
        combi(r - 1, path + "b" + curr, curr + 1, total);
        combi(r, path, curr + 1, total);
    }
}
