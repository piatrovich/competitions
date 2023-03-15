package com.piatrovich.leetcode;

public class SolutionEnhancedSwitch {
    public int romanToInt(String s) {
        int n = 0;
        int prev = 0;
        int r;
        for (int i = s.length() - 1; i >= 0; i--) {
            r = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                default -> 1000;
            };
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
