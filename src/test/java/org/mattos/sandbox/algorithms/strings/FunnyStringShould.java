package org.mattos.sandbox.algorithms.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FunnyStringShould {


    @ParameterizedTest
    @CsvSource({"'acxz', 'Funny'",
                "'bcxz', 'Not Funny'"})
    void tellIfGivenStringIsFunny(String givenString, String expectedAnswer){

        String actual = FunnyString.funnyString(givenString);
        assertThat(actual, is(expectedAnswer));
    }
}
