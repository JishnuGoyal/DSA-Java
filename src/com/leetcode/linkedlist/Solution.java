package com.leetcode.linkedlist;

import java.util.List;

/*
 * This class contains solutions for the following problems:
 *
 * https://leetcode.com/problems/middle-of-the-linked-list/
 * https://leetcode.com/problems/palindrome-linked-list/
 * */
public class Solution {
    public boolean isPalindrome(ListNode head) { // palindrome linked list  234
        // reverse the linked list after middle to the end, then compare
        ListNode middle = MiddleOfTheLinkedList_876(head);
        ListNode tempA = head;

        ListNode tempB = reverse(middle);

        while (true) {
            if (tempA == null || tempB == null) {
                return true;
            }
            if (tempA.val != tempB.val) {
                return false;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }

    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }

        return prev;
    }

    public ListNode MiddleOfTheLinkedList_876(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // this seems like an easier way to understand the logic for breaking out of the loop
        while (true) {
            if (fast == null || fast.next == null) {
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    class ListNode {
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


