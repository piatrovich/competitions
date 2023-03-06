package com.piatrovich.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void testSingleNumber() {
        // given
        int[] nums = new int[]{2, 2, 1};

        // when
        int result = new Solution().singleNumber(nums);

        // then
        assertEquals(1, result);
    }

}
