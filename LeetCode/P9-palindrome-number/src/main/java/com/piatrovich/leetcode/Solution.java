package com.piatrovich.leetcode;

class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        x = Math.abs(x);

        int y = 0;
        int r;

        while (x / 10 != 0 || x % 10 != 0) {
            r = x % 10;
            y = y * 10 + r;
            x /= 10;
        }

        return n == y;
    }
}
