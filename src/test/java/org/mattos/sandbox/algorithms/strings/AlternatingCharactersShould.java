package org.mattos.sandbox.algorithms.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AlternatingCharactersShould {

    @ParameterizedTest
    @CsvSource({"'AAAA', 3", "'BBBBB', 4", "'ABABABAB', 0", "'BABABA', 0", "'AAABBB', 4"} )
    void giveTheMinimumNumberOfRequiredDeletions_toCreateAlternatingCharactersString
            (String givenString, int expectedDeletions){

        int actual = AlternatingCharacters.requiredDeletions(givenString);
        assertThat(actual, is(expectedDeletions));
    }
}
