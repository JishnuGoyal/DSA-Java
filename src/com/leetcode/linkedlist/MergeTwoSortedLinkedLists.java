package com.leetcode.linkedlist;

/*
 *
 * */
public class MergeTwoSortedLinkedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head;
        if (list1 == null) {
            return list2;
        }

        if (list2 == null){
            return list1;
        }

        if (list1.val <= list2.val) {
            head = new ListNode(list1.val);
            list1 = list1.next;
        }
        else {
            head = new ListNode(list2.val);
            list2 = list2.next;
        }

        ListNode tail = head;

        while (!(list1 == null && list2 == null)) {
            if (list1 == null) {
                tail.next = list2;
            } else if(list2 == null){
                tail.next = list1;
            }
            if (list1.val <= list2.val) {
                tail = addNode(tail, list1.val);
                list1 = list1.next;
            } else {
                tail = addNode(tail, list2.val);
                list2 = list2.next;
            }
        }

        return head;
    }

    public ListNode addNode(ListNode tail, int val) {
        ListNode another = new ListNode(val, null);
        tail.next = another;
        return another;
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
