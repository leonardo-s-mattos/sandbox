package org.mattos.sandbox.algorithms.strings;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import org.mattos.sandbox.util.IntegerCollectionsConverter;
import org.mattos.sandbox.util.StringCollectionsConverter;

import java.util.List;

public class WeightedUniformStringsShould {


    @ParameterizedTest
    @CsvSource({"'abccddde', '1,3,12,5,9,10', 'Yes, Yes,Yes,Yes,No,No'",
                "'aaabbbbcccddd', '9,7,8,12,5', 'Yes,No,Yes,Yes,No'"})
    void weightSubStringFromGivenString_andAnswerQueries(String givenPhrase,
                                                         @ConvertWith(IntegerCollectionsConverter.class) int[] queries,
                                    @ConvertWith(StringCollectionsConverter.class) List<String> expectedSubstring){

        WeightedUniformStrings target = new WeightedUniformStrings(givenPhrase);
        String[] actual = target.areElementsOfPossible(queries);
        for (int i = 0; i < actual.length; i++) {
            assertThat(actual[i], is(expectedSubstring.get(i)));
        }
    }


}
