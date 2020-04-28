package org.mattos.sandbox.algorithms.strings;

public class FunnyString {

    // Complete the funnyString function below.
    public static String funnyString(String s) {

        for (int i = 0; i <= s.length()/2; i++) {
            int firstHalfDifference = Math.abs(s.charAt(i) - s.charAt(i+1));
            int secondHalfDifference = Math.abs(s.charAt(s.length()-2-i) - s.charAt(s.length()-1-i));
            if(firstHalfDifference != secondHalfDifference) return "Not Funny";
        }
        return "Funny";
    }

}
