package org.mattos.sandbox.algorithms.implementation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.mattos.sandbox.algorithms.WarmUp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class GradingStudentsShould {

    @ParameterizedTest
    @MethodSource("givenGrades")
    void roundStudentsPassingGradesFollowingTheRules(List<Integer> givenGrades, List<Integer>  expectedFinalGrades){

        List<Integer> actualGrades = GradingStudents.roundGrades(givenGrades);
        assertThat(actualGrades.size(), is(expectedFinalGrades.size()));
        assertTrue(actualGrades.stream().allMatch(num -> expectedFinalGrades.contains(num)));


    }

    private static Stream<Arguments> givenGrades() {
        return Stream.of(
                Arguments.of(Arrays.asList(new Integer[]{73,67,38,33}), Arrays.asList(new Integer[]{75,67,40,33}))
        );
    }
}
