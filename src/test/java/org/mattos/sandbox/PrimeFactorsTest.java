package org.mattos.sandbox;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RunWith(Parameterized.class)
public class PrimeFactorsTest {

    private PrimeFactors target;

    private Integer givenNumber;
    private List<Integer> expectedList;

    @Before
    public void init(){
        target = new PrimeFactors();
    }

    public PrimeFactorsTest (Integer givenNumber, List<Integer> expectedList) {
        this.givenNumber = givenNumber;
        this.expectedList = expectedList;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getTestData(){
        return Arrays.asList(new Object[][]{
                {1, Collections.<Integer>emptyList()},
                {2, Arrays.asList(2)},
                {3, Arrays.asList(3)},
                {4, Arrays.asList(2,2)},
                {5, Arrays.asList(5)},

        });
    }

    @Test
    public void givenValidIntegers_thenReturnTheExpectedResult(){
        Assert.assertThat(target.factorOf(givenNumber), is(expectedList));
    }

    @Test
    public void givenInvalidIntegers_thenException(){


    }
}
