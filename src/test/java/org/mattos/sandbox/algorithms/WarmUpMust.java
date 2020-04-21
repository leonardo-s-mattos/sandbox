package org.mattos.sandbox.algorithms;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import org.mattos.sandbox.util.IntegerCollectionsConverter;
import org.mattos.sandbox.util.IntegerMatrixConverter;

import java.util.List;

public class WarmUpMust {

    @ParameterizedTest
    @CsvSource({"'11,2,4;4,5,6;10,8,-12', 15"})
    void calculateDiagonalDifference(@ConvertWith(IntegerMatrixConverter.class) List<List<Integer>> matrix, int expectedDifference){

        int actualDifference = new WarmUp().diagonalsDifference(matrix);
        assertThat(actualDifference, is(expectedDifference));

    }

    @ParameterizedTest
    @CsvSource({"'-4,3,-9,0,4,1'"})
    void printPositivesNegativesAndZerosFractions_fromArrayOfIntegers(@ConvertWith(IntegerCollectionsConverter.class) int[] givenArray){

        new WarmUp().plusMinus(givenArray);

    }

    @ParameterizedTest
    @CsvSource({"'07:05:45PM','19:05:45'",
                "'12:40:22AM','00:40:22'",
                "'12:45:54PM','12:45:54'",
                "'12:00:00AM','00:00:00'"})
    void convertTimeToMilitary24HoursFormat(String givenOriginalTime, String expectedMilitaryFormatted){

        String actual = new WarmUp().timeConversion(givenOriginalTime);
        assertThat(actual, is(expectedMilitaryFormatted));

    }
}
