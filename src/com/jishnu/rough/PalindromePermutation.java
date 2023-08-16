package com.jishnu.rough;

import java.util.ArrayList;

public class PalindromePermutation {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>() ;
        chopchop("abc", "", a);
        System.out.println("===================");
        System.out.println(a);
    }
    public static void chopchop(String table, String bag,
                                ArrayList<String> AL) {
        if (table.isEmpty()) {
            System.out.println(bag);
            System.out.println(AL);
            System.out.println("==============");
            return;
        }
        for (int chakku = 1; chakku <= table.length(); chakku++) {
            String piece = table.substring(0, chakku);
            String remain = table.substring(chakku);

            AL.add(piece);
            chopchop(remain, bag + "-" + piece, AL);
            AL.remove(AL.size()-1);// Explicit back tracking!

//			System.out.println(piece+ " - "+remain);
//			M1 => AL ko String ki tarah treat karo!!
//			ArrayList<String> AL_nn = new ArrayList<String>(AL);
//			AL_nn.add(piece);
//			chopchop(remain, bag + "-" + piece, AL_nn);
        }
    }


    public static void makeChops(String bag, String table, ArrayList<String> arrayList) {
        if (table.isEmpty()) {
            System.out.println(arrayList);
            return;
        }
        for (int i = 1; i <= table.length(); i++) {
            String piece = table.substring(0, i);
            String remain = table.substring(i);
            arrayList.add(piece);
            makeChops(bag + ", " + piece, remain, arrayList);
        }
    }
}
