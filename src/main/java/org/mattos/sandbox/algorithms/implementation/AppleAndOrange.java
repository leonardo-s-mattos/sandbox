package org.mattos.sandbox.algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleAndOrange {

    // Complete the countApplesAndOranges function below.
    static List<Integer> countApplesAndOranges(int s, int t, int appleTree, int orangeTree, int[] apples, int[] oranges) {

        Integer countApples = 0;
        for (int i = 0; i < apples.length; i++)
            if((apples[i] + appleTree) >= s && (apples[i] + appleTree) <= t) countApples++;

        Integer countOranges = 0;
        for (int i = 0; i < oranges.length; i++)
            if(orangeTree + oranges[i] >= s && orangeTree + oranges[i] <= t) countOranges++;

        return Arrays.asList(countApples, countOranges);
    }
}
