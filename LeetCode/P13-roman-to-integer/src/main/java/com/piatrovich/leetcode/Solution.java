package com.piatrovich.leetcode;

class Solution {
    public int romanToInt(String s) {
        int n = 0;
        while (s.length() > 0) {
            if (s.startsWith("M")) {
                n += 1000;
                s = s.substring(1);
            } else if (s.startsWith("CM")) {
                n += 900;
                s = s.substring(2);
            } else if (s.startsWith("D")) {
                n += 500;
                s = s.substring(1);
            } else if (s.startsWith("CD")) {
                n += 400;
                s = s.substring(2);
            } else if (s.startsWith("C")) {
                n += 100;
                s = s.substring(1);
            } else if (s.startsWith("XC")) {
                n += 90;
                s = s.substring(2);
            } else if (s.startsWith("L")) {
                n += 50;
                s = s.substring(1);
            } else if (s.startsWith("XL")) {
                n += 40;
                s = s.substring(2);
            } else if (s.startsWith("X")) {
                n += 10;
                s = s.substring(1);
            } else if (s.startsWith("IX")) {
                n += 9;
                s = s.substring(2);
            } else if (s.startsWith("V")) {
                n += 5;
                s = s.substring(1);
            } else if (s.startsWith("IV")) {
                n += 4;
                s = s.substring(2);
            } else {
                n += 1;
                s = s.substring(1);
            }
        }
        return n;
    }
}
