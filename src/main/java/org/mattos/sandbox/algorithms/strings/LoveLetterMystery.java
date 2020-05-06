package org.mattos.sandbox.algorithms.strings;

public class LoveLetterMystery {

    static int theLoveLetterMystery(String s) {

        int modifications = 0;
        char[] givenStringInChars = s.toCharArray();
        int halfStringSize = givenStringInChars.length / 2;
        for(int i=0; i<halfStringSize;i++){
            while(givenStringInChars[i] != givenStringInChars[givenStringInChars.length-1-i]) {
                if (givenStringInChars[i] > givenStringInChars[givenStringInChars.length - 1 - i])
                    givenStringInChars[i]--;
                else
                    givenStringInChars[givenStringInChars.length - 1 - i]--;

                modifications++;
            }
        }

        return modifications;
    }

}
