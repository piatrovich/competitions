package com.piatrovich.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "0P,false"
    })
    void test(String s, boolean answer) {
        // when
        boolean response = new Solution().isPalindrome(s);

        // then
        assertEquals(answer, response);
    }

    @Test
    void printASCII() {
        for (int i = 0; i < 128; i++) {
            char ch = (char)i;
            System.out.println(i + " -> " + ch);
        }
    }

}
