package com.piatrovich.leetcode;

public class Solution2 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        var binary = Integer.toBinaryString(n);
        var bytes = binary.getBytes();

        int counter = 0;
        for (byte b : bytes) {
            if (b == 49) {
                ++counter;
            }
        }

        return counter;
    }
}
