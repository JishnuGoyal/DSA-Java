package com.jishnu.practice.recursion.advanced;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        StringBuilder rings = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            rings.append(i);
        }

        System.out.println(rings);
        move(rings.toString(), 'A' , 'C');
    }

    public static void move(String rings, char source, char destination){
        if (rings.length() == 1) {
            System.out.println("Moving ring " + rings + " from " + source + " to " + destination);
            return;
        }

        String ringsAboveBottomRing = rings.substring(0, rings.length() - 1);
        String bottomRing = rings.substring(rings.length() - 1);

        char intermediateDestination = resolveDestination(source, destination);
        if (intermediateDestination == ' '){
            System.out.println("failed to resolve destination");
             return;
        }

        move(ringsAboveBottomRing, source, intermediateDestination);
        move(bottomRing, source, destination);
        move(ringsAboveBottomRing, intermediateDestination, destination);
    }

    private static char resolveDestination(char source, char destination) {
        if (source + destination == 'A' + 'C') return 'B';
        if (source + destination == 'B' + 'C') return 'A';
        if (source + destination == 'B' + 'A') return 'C';
        else return ' ';
    }

//    public static void moveAtoC(String rings) {
//        if (rings.length() == 1) {
//            System.out.println("Moving ring " + rings + "from A to C");
//            return;
//        }
//
//        String ringsAboveBottomRing = rings.substring(rings.length() - 2);
//        String bottomRing = rings.substring(rings.length() - 1);
//
//        moveAtoB(ringsAboveBottomRing);
//        moveAtoC(bottomRing);
//        moveBtoC(ringsAboveBottomRing);
//    }
//
//    private static void moveBtoC(String rings) {
//        if (rings.length() == 1) {
//            System.out.println("Moving ring " + rings + "from B to C");
//            return;
//        }
//
//        String ringsAboveBottomRing = rings.substring(rings.length() - 2);
//        String bottomRing = rings.substring(rings.length() - 1);
//
//        moveBtoA(ringsAboveBottomRing);
//        moveBtoC(bottomRing);
//        moveAtoC(ringsAboveBottomRing);
//    }
//
//
//
//    private static void moveAtoB(String rings) {
//        if (rings.length() == 1) {
//            System.out.println("Moving ring " + rings + "from A to B");
//            return;
//        }
//        String ringsAboveBottomRing = rings.substring(rings.length() - 2);
//        String bottomRing = rings.substring(rings.length() - 1);
//
//        moveAtoC(ringsAboveBottomRing);
//        moveAtoB(bottomRing);
//        moveCtoB(ringsAboveBottomRing);
//    }


}

