package org.mattos.sandbox.algorithms.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DetermingDNAHealthShould {

    @ParameterizedTest
    @MethodSource("providedDataPoints")
    void evaluateDNASequences_returningTheLeastAndMostHealthyOnes(
            String[] genes, int[] health, List<DetermingDNAHealth.DataPoint> dataPoints, Integer[] expectedResult){


        Integer[] actual = DetermingDNAHealth.evaluateDNA(genes, health, dataPoints);
        for (int i = 0; i < expectedResult.length; i++) {
            assertThat(actual[i], is(expectedResult[i]));
        }

    }

    private static Stream<Arguments> providedDataPoints() {
        List<DetermingDNAHealth.DataPoint> dataPoints = new ArrayList<>();
        dataPoints.add(new DetermingDNAHealth.DataPoint(1,5,"caaab"));
        dataPoints.add(new DetermingDNAHealth.DataPoint(0,4,"xyz"));
        dataPoints.add(new DetermingDNAHealth.DataPoint(2,4,"bcdybc"));

        int[] health = {1,2,3,4,5,6};

        return Stream.of(
                Arguments.of(new String[]{"a", "b", "c", "aa", "d", "b"}, health, dataPoints, new Integer[]{0,19} )
        );
    }
}
