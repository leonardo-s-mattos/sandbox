package org.mattos.sandbox.algorithms.strings;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class PangramsShould {

    @ParameterizedTest
    @CsvSource({"'We promptly judged antique ivory buckles for the next prize', 'pangram'",
            "'We promptly judged antique ivory buckles for the prize', 'not pangram'"})
    void tellIfGivenPhraseIsPangram(String givenPhrase, String expectedAnswer){

        String actual = Pangrams.pangrams(givenPhrase);
        assertThat(actual, is(expectedAnswer));
    }


}
