package org.mattos.sandbox.problemsolving;

import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {

    public long blowCandles(int[] givenCandlesHeights) {

        long result = 0;

        int maxHeight = Arrays.stream(givenCandlesHeights).map(v->v).max().getAsInt();

        result = Arrays.stream(givenCandlesHeights)
                .map(v->v).filter(candleHeight -> maxHeight==candleHeight).count();

        return result;
    }
}
