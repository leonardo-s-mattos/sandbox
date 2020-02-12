package org.mattos.sandbox.problemsolving;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;

@RunWith(Parameterized.class)
public class StaircaseTest {


    private Staircase target;

    private int givenNumber;
    private String expectedStaircase;

    public StaircaseTest (int givenNumber, String expectedStaircase) {
        this.givenNumber = givenNumber;
        this.expectedStaircase = expectedStaircase;
    }

    @Before
    public void init(){
        target = new Staircase();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getTestData(){
        return Arrays.asList(new Object[][]{
                {1, "#"},
                {2, " #\n##"},
                {6, "     #\n    ##\n   ###\n  ####\n #####\n######"},
                {10, "         #\n        ##\n       ###\n      ####\n     #####\n    ######\n   " +
                        "#######\n  ########\n #########\n##########"},

        });
    }

    @Test
    public void givenValidIntegers_thenReturnTheExpectedResult(){
        String actual = target.build(givenNumber);
        System.out.println(actual);
        Assert.assertThat(actual, is(expectedStaircase));
    }


}
