package org.mattos.sandbox.algorithms.string;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mattos.sandbox.algorithms.strings.SeparateNumbers;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class SeparateNumbersShould {

    private List<String> givenStrings;
    private List<String> expectedResults;

    public SeparateNumbersShould (List<String> givenStrings, List<String> expectedResults) {
        this.givenStrings = givenStrings;
        this.expectedResults = expectedResults;
    }

    @Test
    public void checkIfAStringIsBeautiful_andPrintResult(){

        for (int i = 0; i < givenStrings.size(); i++) {
            assertThat(SeparateNumbers.separateNumbers(givenStrings.get(i)), is(expectedResults.get(i)));
        }

    }

    @Parameterized.Parameters
    public static Collection<Object[]> sampleNotNullStrings() {
        return Arrays.asList(new Object[][]{
                {Arrays.asList("1234", "91011", "99100", "101103", "010203", "13", "1"),
                        Arrays.asList("YES 1", "YES 9","YES 99","NO","NO","NO","NO")},
                {Arrays.asList("99910001001", "7891011", "9899100", "999100010001"),
                        Arrays.asList("YES 999", "YES 7","YES 98","NO")}
        });
    }
}
