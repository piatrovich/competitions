package com.piatrovich.leetcode;

public class SolutionEnhancedSwitch2 {
    public int romanToInt(String s) {
        int n = 0;
        int prev = 0;
        int r;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I' -> r = 1;
                case 'V' -> r = 5;
                case 'X' -> r = 10;
                case 'L' -> r = 50;
                case 'C' -> r = 100;
                case 'D' -> r = 500;
                default -> r = 1000;
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
