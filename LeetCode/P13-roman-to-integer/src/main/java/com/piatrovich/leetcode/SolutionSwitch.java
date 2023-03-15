package com.piatrovich.leetcode;

public class SolutionSwitch {
    @SuppressWarnings("")
    public int romanToInt(String s) {
        int n = 0;
        int prev = 0;
        int r;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I': r = 1; break;
                case 'V': r = 5; break;
                case 'X': r = 10; break;
                case 'L': r = 50; break;
                case 'C': r = 100; break;
                case 'D': r = 500; break;
                default: r = 1000;
            }
            if (r < prev) {
                n -= r;
            } else {
                n += r;
            }
            prev = r;
        }
        return n;
    }
}
