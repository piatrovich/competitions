package com.piatrovich.leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int reverse(int x) {
        if (x / 10 == 0) {
            return x;
        }

        List<Integer> digits = new ArrayList();

        int q = x / 10;
        while (q != 0) {
            digits.add(x % 10);
            q = x / 10;
            x = q;
        }

        long y = 0;
        for (int i = 0; i < digits.size(); ++i) {
            y += (long) digits.get(i) * Math.pow(10, digits.size() - 1 - i);
        }

        return y > (long)Integer.MAX_VALUE || y < (long)Integer.MIN_VALUE ? 0 : (int)y;
    }
}
