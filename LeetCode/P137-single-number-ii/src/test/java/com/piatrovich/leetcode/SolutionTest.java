package com.piatrovich.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @ParameterizedTest
    @MethodSource("testArray")
    void testSingleNumber(int[] nums, int answer) {

        // when
        int result = new Solution().singleNumber(nums);

        // then
        assertEquals(answer, result);
    }

    private static Stream<Arguments> testArray() {
        return Stream.of(
                Arguments.of(new int[]{3}, 3),
                Arguments.of(new int[]{2, 2, 1, 2}, 1),
                Arguments.of(new int[]{0, 1, 0, 1, 0, 1, 99}, 99),
                Arguments.of(new int[]{87, 1, 1, 1}, 87)
        );
    }

}
