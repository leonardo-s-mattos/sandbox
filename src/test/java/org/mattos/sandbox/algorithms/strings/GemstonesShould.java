package org.mattos.sandbox.algorithms.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import org.mattos.sandbox.util.StringCollectionsConverter;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class GemstonesShould {

    @ParameterizedTest
    @CsvSource({"'abcdde,baccd,eeabg', 2"})
    void findGemsOnGivenRocks(@ConvertWith(StringCollectionsConverter.class) List<String> givenStrings, int expectedGems){

        int actual = Gemstones.countGemstones(givenStrings.toArray(new String[0]));
        assertThat(actual, is(expectedGems));
    }

}
