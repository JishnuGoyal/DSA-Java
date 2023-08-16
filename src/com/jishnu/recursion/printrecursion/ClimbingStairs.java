package com.jishnu.recursion.printrecursion;

public class ClimbingStairs {
    public static void main(String[] args) {
        findCombinations(0, "", 5);
    }

    public static void findCombinations(int position, String path, int targetFloor) {
        if (position == targetFloor) {  // positive base - case
            System.out.println(path);
            return;
        } else if (position > 5) { // negative base - case
            return;
        }

        findCombinations(position + 1, path + " 1", targetFloor);
        findCombinations(position + 2, path + " 2", targetFloor);
    }
}
