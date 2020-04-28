package org.mattos.sandbox.algorithms.strings;

import java.util.Arrays;
import java.util.List;


public class Gemstones {

    // Complete the gemstones function below.
    public static int countGemstones(String[] arr) {

        List<String> letters = Arrays.stream(arr[0].split("")).distinct().collect(Collectors.toList());

        int gemCount = 0;
        for (String letter: letters
             ) {
            int loopCount = 1;
            while(loopCount < arr.length && arr[loopCount].indexOf(letter) >= 0  ){
                loopCount++;
            }
            if(loopCount == arr.length) gemCount++;
        }

        return gemCount;
    }

}
