package org.mattos.sandbox.problemsolving;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.*;

@RunWith(Parameterized.class)
public class BirthdayCakeCandlesTest {

    private BirthdayCakeCandles target;

    private int[] givenCandlesHights;
    private long expectedNumberOfCandlesBlown;

    public BirthdayCakeCandlesTest(int[] givenCandlesHights, int expectedNumberOfCandlesBlown){
        this.expectedNumberOfCandlesBlown = expectedNumberOfCandlesBlown;
        this.givenCandlesHights = givenCandlesHights;

    }

    @Before
    public void init(){
        target = new BirthdayCakeCandles();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getGoodData(){
        return Arrays.asList(new Object[][]{
                {new int[]{3,2,1,3}, 2},
                {new int[]{10,10,10,9,4,10,5,10,3,10},6},
        });
    }

    @Test
    public void givenGoodCandleHights_returnTheExpectedNumberOfCandlesBlown(){

        long actual = target.blowCandles(givenCandlesHights);
        Assert.assertThat(actual, is(expectedNumberOfCandlesBlown));
    }

}
