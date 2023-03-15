package com.piatrovich.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideTestCase")
    void testConditional(String s, int n) {
        // when
        int result = new SolutionConditional().romanToInt(s);

        // then
        assertEquals(n, result);
    }

    @ParameterizedTest
    @MethodSource("provideTestCase")
    void testSwitch(String s, int n) {
        // when
        int result = new SolutionSwitch().romanToInt(s);

        // then
        assertEquals(n, result);
    }

    @ParameterizedTest
    @MethodSource("provideTestCase")
    void testEnhancedSwitch(String s, int n) {
        // when
        int result = new SolutionEnhancedSwitch().romanToInt(s);

        // then
        assertEquals(n, result);
    }

    static Stream<Arguments> provideTestCase() {
        return Stream.of(
                Arguments.of("I", 1),
                Arguments.of("II", 2),
                Arguments.of("III", 3),
                Arguments.of("IV", 4),
                Arguments.of("V", 5),
                Arguments.of("XI", 11),
                Arguments.of("XIX", 19),
                Arguments.of("XXV", 25),
                Arguments.of("XXIX", 29),
                Arguments.of("CD", 400),
                Arguments.of("CM", 900),
                Arguments.of("MDLXXVIII", 1578),
                Arguments.of("MMMCMXCIX", 3999)
        );
    }
}
