package com.leetcode.linkedlist;


import java.util.LinkedList;

public class ReverseNodesInKGroup {
    public static void main(String[] args) {

        ListNode l5 = new ListNode(5, null);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        reverseKGroup(l1, 2);

    }

    public  static  ListNode reverseKGroup(ListNode head, int k) {
        ListNode start = head;
        ListNode end = start;

        int i = k;
        while(i - 1 > 0){
            if(end.next == null){
                return start;
            }
            end = end.next;
            i--;
        }


        ListNode after = end.next;
        end.next = null;
        reverse(start);

        start.next = reverseKGroup(after, k);
        return end;
    }


    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }

        return prev;
    }

    public static class ListNode {
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
