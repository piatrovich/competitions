package com.piatrovich.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution2Test {

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,1",
            "3,2"
    })
    void test(int n, int bits) {
        // when
        int answer = new Solution2().hammingWeight(n);

        // then
        assertEquals(bits, answer);
    }
}
