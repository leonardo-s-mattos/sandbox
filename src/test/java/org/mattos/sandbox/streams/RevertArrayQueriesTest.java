package org.mattos.sandbox.streams;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mattos.sandbox.stream.RevertArrayQueries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(JUnit4.class)
public class RevertArrayQueriesTest {

    RevertArrayQueries target = new RevertArrayQueries();

    @Test
    public void testRevert(){
       List<Integer> actual = target.revertArray(Arrays.asList(Integer.valueOf(1),
               Integer.valueOf(2), Integer.valueOf(3)), Arrays.asList(Arrays.asList(0,2),
               Arrays.asList(1,2), Arrays.asList(0,2)));
       System.out.println(actual);
    }
}
