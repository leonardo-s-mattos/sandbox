package org.mattos.sandbox.codesignal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mattos.sandbox.ondeck.Exercise;

@RunWith(JUnit4.class)
public class AditiMust {

   private Aditi target;

    @Before
    public void init(){
        target = new Aditi();
    }

    @Test
    public void checkBanagrams_true(){
        boolean actual = target.checkBlanagrams("aba", "bab");
        Assert.assertTrue(actual);
    }

    @Test
    public void checkBanagrams_true2(){
        boolean actual = target.checkBlanagrams("tangram", "anagram");
        Assert.assertTrue(actual);
    }



    @Test
    public void checkBanagrams_false(){

        boolean actual = target.checkBlanagrams("silent", "listen");
        Assert.assertTrue(!actual);
    }

}
