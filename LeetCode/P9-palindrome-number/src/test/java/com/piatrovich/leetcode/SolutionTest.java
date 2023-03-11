package com.piatrovich.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "121,true",
            "10,false",
            "-121,false"
    })
    void test(int x, boolean answer) {
        // when
        boolean response = new Solution().isPalindrome(x);

        //then
        assertEquals(answer, response);
    }
}
