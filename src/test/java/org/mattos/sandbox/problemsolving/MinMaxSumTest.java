package org.mattos.sandbox.problemsolving;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;

@RunWith(Parameterized.class)
public class MinMaxSumTest {


    private MinMaxSum target;

    private int[] givenArray;
    private List<String> expectedList;

    public MinMaxSumTest(int[] givenArray, List<String> expectedList){
        this.expectedList = expectedList;
        this.givenArray = givenArray;
    }

    @Before
    public void init(){
        target = new MinMaxSum();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getGoodTestData(){
        return Arrays.asList(new Object[][]{
                {new int[]{1,2,3,4,5}, Arrays.asList(new String[]{"10","14"})},
                {new int[]{256741038,623958417,467905213,714532089,938071625}, Arrays.asList(new String[]{"2063136757", "2744467344"})}
        });
    }

    @Parameterized.Parameters
    public static Object[] getBadTestData(){
        return new Object[][]{
                {new int[]{1,2,3,4}, null},
        };
    }

    @Test
    public void givenGoodData_thenResultIsAsExpected(){

        List<String> actual = target.sum(givenArray);
        System.out.println(actual);
        Assert.assertThat(actual, is(expectedList));
    }


    @Test
    public void givenBadData_thenDontCalculateAnything(){

        List<String> actual = target.sum(new int[]{1,2,3,4});
        System.out.println(actual);
        Assert.assertThat(actual, nullValue());
    }
}
