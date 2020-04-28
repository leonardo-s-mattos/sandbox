package org.mattos.sandbox.algorithms.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BeautifulBinaryString {

    // Complete the beautifulBinaryString function below.
    public static int beautifulBinaryString(String b) {

        /*
        int findCounter = 0;
        int location = b.indexOf("010");
        int previousLocation = location - 4;
        while (location >= 0){
            if( previousLocation + 3 <= location ) {
                findCounter++;
                previousLocation = location;
            }
            location = b.indexOf("010", location+1);

        }

        return findCounter;
        */

        return removeUgliness(b, 0);
    }

    private static int removeUgliness(String s, int count){

        if(s.indexOf("010") < 0) return count;

        return removeUgliness(s.replaceFirst("010", "011"),count+1);
    }
}
