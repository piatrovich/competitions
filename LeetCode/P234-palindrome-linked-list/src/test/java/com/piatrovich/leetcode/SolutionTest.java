package com.piatrovich.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.piatrovich.leetcode.ListNodeUtils.createList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "1 2 2 1,true",
            "1 2,false"
    })
    void test(String digits, boolean answer) {
        // given
        ListNode first = createList(digits);

        // when
        boolean response = new Solution().isPalindrome(first);

        // then
        assertEquals(answer, response);
    }

}
