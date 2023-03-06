package com.piatrovich.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "-1,false",
            "0,true",
            "2, true",
            "16, true",
            "21, false"
    })
    void test(int n, boolean answer) {
        // when
        boolean result = new Solution().isPowerOfTwo(n);

        // then
        assertEquals(answer, result);
    }
}
