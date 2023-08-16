package com.jishnu.stackquerylinkedlist.linkedlist.class_questions;

import java.util.LinkedList;

/*
 * Given a linked list, reverse after every k nodes.
 * 1- 2- 3 - 4 -5 6- 7- 8 -9 becomes 3-2-1-6-5-4-9-8-7
 */
public class K_Reverse {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
    }



    /* this is yet to be check if it is correct of not*/
//    public static Node k_reverse(Node head, int k) {
//        if (head.next == null){
//            return head;
//        }
//        Node tail = head;
//        int count = k;
//        while (count > 0) {
//            tail = tail.next;
//            count--;
//        }
//        Node after = tail.next;
//        tail.next = null;
//        (Rev2(head)).next = k_reverse(after, k);
//        return tail;
//    }
//
//    private static Node Rev2(Node nn) {
//        if(nn.next ==null) {
//            return nn;
//        }
//        Node Tail = Rev2(nn.next);
//        Tail.next = nn;
//        nn.next = null;
//        return nn;
//    }
}
