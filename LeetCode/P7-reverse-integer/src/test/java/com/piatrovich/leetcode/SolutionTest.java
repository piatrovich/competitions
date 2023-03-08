package com.piatrovich.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "123,321",
            "-123,-321",
            "120,21"
    })
    void test(int n, int answer) {
        // when
        int result = new Solution().reverse(n);

        // then
        assertEquals(answer, result);
    }

}