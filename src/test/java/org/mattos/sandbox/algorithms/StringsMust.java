package org.mattos.sandbox.algorithms;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.platform.commons.util.CollectionUtils;
import org.mattos.sandbox.util.IntegerCollectionsConverter;
import org.mattos.sandbox.util.IntegerMatrixConverter;
import org.mattos.sandbox.util.StringCollectionsConverter;

import java.util.Collections;
import java.util.List;


public class StringsMust {

    @ParameterizedTest
    @CsvSource({"'aab,aac', '3,8', 'aab,c'",
                "'abc,cd', '1,5,7', 'a,bc,cd'"})
    void presentTheNthPossibleSubstring_ofAGivenStringArray(@ConvertWith(StringCollectionsConverter.class) List<String> givenList,
                                                            @ConvertWith(IntegerCollectionsConverter.class) int[] queries,
                                                            @ConvertWith(StringCollectionsConverter.class) List<String> expectedSubstring){
        String[] givenArray = givenList.toArray(new String[0]);
        String[] actual = new Strings().findStrings(givenArray, queries);
        for (int i = 0; i < actual.length; i++) {
            assertThat(actual[i], is(expectedSubstring.get(i)));
        }


    }

    @ParameterizedTest
    @CsvSource({"'aab,aac', '23', 'INVALID'"})
    void notifyTheGivenQueryIsInvalid_whenNotThatManySubstringsExist(@ConvertWith(StringCollectionsConverter.class) List<String> givenArray,
                                                             int queries,
                                                             String invalidMessage){

        String[] actual = new Strings().findStrings(givenArray.toArray(new String[0]), new int[]{queries});
        assertThat(actual[0], is(invalidMessage));
    }

    @ParameterizedTest
    @CsvSource({"'aab', 'b'",
                "'baab', 'Empty String'",
                "'aaabccddd', 'abd'"})
    void reduceGivenStringToSmallerSize_includingJustUniqueCharacters(String givenString, String expectedReduction){

        String actual = new Strings().superReducedString(givenString);
        assertThat(actual, is(expectedReduction));
    }

    @ParameterizedTest
    @CsvSource({"'saveChangesInTheEditor', 5",
            "'baab', 1",
            "'',0"})
    void countWordsOnGivenCamelCasedString(String givenString, int expectedWordCount){

        int actual = new Strings().camelcase(givenString);
        assertThat(actual, is(expectedWordCount));
    }


    @ParameterizedTest
    @CsvSource({"3, 'Ab1', 3",
            "11,'#HackerRank', 1",
            "0,'',6",
            "4, '4700', 3",
            "7, 'AUzs-nV', 1"})
    void suggestModificationsOnGivenPassword_toMakeItStrong(int size, String givenString, int expectedNumberOfExtraChars){

        int actual = new Strings().minimumNumber(size, givenString);
        assertThat(actual, is(expectedNumberOfExtraChars));
    }
}
