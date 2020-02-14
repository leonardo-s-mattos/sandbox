package org.mattos.sandbox.ondeck;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class ExerciseTest {

   private Exercise target;

   @Before
    public void init(){
       target = new Exercise();
   }

   @Test
    public void size_given(){
       int actual = target.size(new int[]{1,4,-1,3,2});
       Assert.assertTrue(actual==4);
   }

   @Test
    public void semiAlternating(){

       int actual = target.semiAlternating("baaabbabbb");
       Assert.assertTrue(actual==7);
   }
}
