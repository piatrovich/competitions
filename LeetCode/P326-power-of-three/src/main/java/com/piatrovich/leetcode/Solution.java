package com.piatrovich.leetcode;

class Solution {
    public boolean isPowerOfThree(int n) {
        // N to the power of 0
        if (n == 1) {
            return true;
        }

        // N is not a power of three:
        // - if below zero
        // - N mod 3 is not zero
        if (n <= 0 || n % 3 > 0) {
            return false;
        }

        // 2. divide number by 3 until N mod 3 is 0
        while (n % 3 == 0) {
            n = n / 3;
        }

        // N is power of three only if remainder is 1
        return n == 1 ? true : false;
    }
}
