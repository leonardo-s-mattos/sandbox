package org.mattos.sandbox.algorithms.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LoveLetterMysteryShould {

    @ParameterizedTest
    @CsvSource({"'abc', 2", "'abcba', 0", "'abcd', 4", "'cba', 2"} )
    void giveTheMinimumNumberOfRequiredModifications_toCreatePalendronesOutOfGivenStrings
            (String givenString, int expectedModifications){

        int actual = LoveLetterMystery.theLoveLetterMystery(givenString);
        assertThat(actual, is(expectedModifications));
    }
}
