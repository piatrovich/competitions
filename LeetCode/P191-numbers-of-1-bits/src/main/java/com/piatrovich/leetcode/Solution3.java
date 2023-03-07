package com.piatrovich.leetcode;

public class Solution3 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}
