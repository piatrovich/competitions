package com.piatrovich.leetcode;

public class ListNodeUtils {
    public static ListNode createList(String digits) {
        String[] arr = digits.split(" ");
        ListNode first = new ListNode(Integer.parseInt(arr[0]));
        ListNode nextNode = first;
        for (int i = 1; i < arr.length; i++) {
            nextNode.next = new ListNode(Integer.parseInt(arr[i]));
            nextNode = nextNode.next;
        }
        return first;
    }
}
