package com.piatrovich.leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution2 {
    public int reverse(int x) {
        if (x / 10 == 0) return x;

        int q = x / 10;
        int r = 0;
        long y = 0L;
        while (q != 0) {
            r = x % 10;
            q = x / 10;
            y = y * 10 + r;
            x = q;

        }

        return y > (long) Integer.MAX_VALUE || y < (long) Integer.MIN_VALUE ? 0 : (int) y;
    }
}
