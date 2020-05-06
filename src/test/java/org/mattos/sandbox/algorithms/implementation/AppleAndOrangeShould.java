package org.mattos.sandbox.algorithms.implementation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class AppleAndOrangeShould {

    @ParameterizedTest
    @MethodSource("givenGrades")
    void countHowManyApplesAndOrangesFallOverTheHouse(
            int s, int t, int a, int b, int[] apples, int[] oranges, int expectedApples, int expectedOranges
    ){

        List<Integer> actualCount = AppleAndOrange.countApplesAndOranges(s, t, a, b, apples, oranges);
        assertThat(actualCount.size(), is(2));
        assertThat(actualCount.get(0), is(expectedApples));
        assertThat(actualCount.get(1), is(expectedOranges));
    }

    private static Stream<Arguments> givenGrades() {
        return Stream.of(
                Arguments.of(7, 11, 5, 15, new int[]{-2, 2, 1}, new int[]{5, -6}, 1, 1)
        );
    }
}
