package com.jishnu.stackquerylinkedlist.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_demo {
    public static void main(String[] args) {
        LinkedList<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q.peek());

//        System.out.println(q);


//        reverse(q);
        print(q);
        System.out.println("=======");
        System.out.println(q);
    }

    public static void print(Queue<Integer> q) {
        int size = q.size();

        for (int i = 0; i < size; i++) {
            int element = q.peek();
            System.out.println(element);
            q.poll();
            q.add(element);
        }
    }

    private static void printReverse(Queue<Integer> q) {

    }

    public static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }
        int a = q.peek();
        q.poll();
        reverse(q);
        q.add(a);
    }
}
