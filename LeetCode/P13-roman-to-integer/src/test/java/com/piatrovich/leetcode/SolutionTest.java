package com.piatrovich.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "X,10",
            "IX,9"
    })
    void test(String s, int n) {
        // when
        int result = new Solution().romanToInt(s);

        // then
        assertEquals(n, result);
    }
}
