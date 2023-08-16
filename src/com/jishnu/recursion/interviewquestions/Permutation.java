package com.jishnu.recursion.interviewquestions;

public class Permutation {
    public static void main(String[] args) {

    }

    public static void chopchop(String path, boolean[] picked, int countPicked){
        if (countPicked == 2) {
            System.out.println(path);
            return;
        }

        for (int i = 0; i < 2; i++) {
            picked[i] = true;
            chopchop("b" + i, picked, countPicked++);
        }
    }
}
