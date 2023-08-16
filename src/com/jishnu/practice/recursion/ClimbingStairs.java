package com.jishnu.practice.recursion;

import java.util.ArrayList;

public class ClimbingStairs {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        climb(0, "", 5, al);
        System.out.println(al.size());
    }

    public static void climb(int position, String path, int destination, ArrayList<String> al) {
        if (position == destination) { // +ve bc
            al.add(path);
            return;
        }
        if (position > destination) { // -ve bc
            return;
        }
        climb(position + 1, path + "1 ", destination, al);
        climb(position + 2, path + "2 ", destination, al);
    }
}
