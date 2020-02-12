package org.mattos.sandbox.problemsolving;

import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {

    public long blowCandles(int[] givenCandlesHeights) {

        long result = 0;

        Long maxHeight = Arrays.stream(givenCandlesHeights).mapToLong(v->v).max().getAsLong();

        result = Arrays.stream(givenCandlesHeights)
                .mapToLong(v->v).filter(candleHeight -> maxHeight.equals(candleHeight)).count();

        return result;
    }
}
