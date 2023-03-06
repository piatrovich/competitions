package com.piatrovich.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testSingleNumber(int n, boolean expected) {
        // when
        boolean answer = new Solution().isPowerOfThree(n);

        // then
        assertEquals(expected, answer);
    }

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(1, true),
                Arguments.of(-1, false),
                Arguments.of(27, true),
                Arguments.of(45, false)
        );
    }

}
