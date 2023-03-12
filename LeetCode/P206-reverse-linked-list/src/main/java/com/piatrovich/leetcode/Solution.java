package com.piatrovich.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        List<Integer> list = new ArrayList();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        Collections.reverse(list);

        ListNode answer = new ListNode(list.get(0));
        ListNode curr = answer;
        for (int i = 1; i < list.size(); i++) {
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }

        return answer;
    }
}
