package org.mattos.sandbox.algorithms.implementation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class KangorooMust {

    @ParameterizedTest
    @CsvSource({"0,3,4,2, 'YES'",
                "0,2,5,3, 'NO'",
                "21,6,47,3, 'NO'",
                "28,8,96,2, 'NO'",
                "42,3,94,2, 'YES'",
                "7271,2211,7915,2050, 'YES'",
                "1817,9931,8417,190, 'NO'"})
    void jumpTogetherAndLandAtSameSpot(int x1, int v1, int x2, int v2, String expectedAnswer){

        String actual = Kangoroo.jump(x1, v1, x2, v2);
        assertThat(actual, is(expectedAnswer));
    }
}
