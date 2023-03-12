package com.piatrovich.leetcode;

class IterativeSolution {

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode prev = null;
        while (head.next != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        head.next = prev;

        return head;
    }

}
