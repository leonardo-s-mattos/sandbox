package org.mattos.sandbox.algorithms.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mattos.sandbox.algorithms.strings.AlternatingCharacters;
import org.mattos.sandbox.algorithms.strings.BeautifulBinaryString;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BeautifulBinaryStringShould {


    @ParameterizedTest
    @CsvSource({"'0101010', 2", "'01100', 0", "'0100101010', 3"} )
    void giveTheMinimumNumberOfSteps_toCreateBeautifulBinaryString
            (String givenString, int expectedDeletions){

        int actual = BeautifulBinaryString.beautifulBinaryString(givenString);
        assertThat(actual, is(expectedDeletions));
    }
}
