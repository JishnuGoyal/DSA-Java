package com.leetcode.linkedlist;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ahead = head;
        ListNode before = head;

        while (n > 0) {
            ahead = ahead.next;
            n--;
        }

        while (ahead != null) {
            before= before.next;
            ahead = ahead.next;
        }

        return before;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
