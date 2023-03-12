package com.piatrovich.leetcode;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        System.out.println(s);
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (ch >= 97 && ch <= 122) {
                sb.append(ch);
            } else if (ch >= 48 && ch <= 57) {
                sb.append(ch);
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}
