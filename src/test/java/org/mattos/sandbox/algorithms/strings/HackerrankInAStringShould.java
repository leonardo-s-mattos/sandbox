package org.mattos.sandbox.algorithms.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class HackerrankInAStringShould {

    @ParameterizedTest
    @CsvSource({"'hhaacckkekraraannk', 'YES'",
            "'rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt', 'NO'"})
    void validateHackerrankeIsASubsequenceOfGivenString(String givenString, String expectedAnswer){

        String actual = HackerrankInAString.hackerrankInString(givenString);
        assertThat(actual, is(expectedAnswer));
    }

}
