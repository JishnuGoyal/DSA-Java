package com.jishnu.practice.recursion.advanced;

import java.util.ArrayList;
import java.util.Scanner;

public class CodesOfTheString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        findCodes(new ArrayList<>(), input);

        System.out.println(codes);
    }

    static ArrayList<String> codes = new ArrayList<>();
    static ArrayList<String> bag = new ArrayList<>();

    public static void findCodes(ArrayList<Integer> list, String input) {
        if (input.isEmpty()) {
            for (int ele: list){
                if (ele > 26) return;
            }
            codes.add(convertToString(list));
            return;
        }

        for (int i = 1; i <= Math.min(input.length(), 2); i++) {
            String piece = input.substring(0, i);
            String remain = input.substring(i);

            list.add(Integer.parseInt(piece));
            findCodes(list, remain);
            list.remove(list.size() - 1);
        }

    }

    private static String convertToString(ArrayList<Integer> list) {
        StringBuilder s = new StringBuilder();
        for (int num: list){
            // this is a mapping function, f(x) = x + 'a' - 1
            // f(x) will always return an integer that, when converted to char will give a mapped char
            s.append((char)(num + 'a' - 1));
        }
        return s.toString();
    }
}


