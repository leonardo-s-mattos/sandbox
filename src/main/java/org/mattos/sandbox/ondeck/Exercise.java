package org.mattos.sandbox.ondeck;

public class Exercise {

    public int size(int[] A) {
        // my logic is simple : going over the array and counting the
        int numberOfNodes = 0;
        int nodeValue = 0;
        while( nodeValue>=0 ){

            nodeValue =  openNode(A, nodeValue);
            numberOfNodes++;
        }

        return numberOfNodes;
    }

    private int openNode(int[] A, int position){
        return A[position];
    }


    public int semiAlternating(String S) {

        if(S == null) return 0;
        if(S.length()<=2) return S.length(); // if the given string has less of 3 characters,
                                             // then its a semi alternating.
        int result = 0;
        for (int currentPosition=2, initialPositionOfSemiAlternating=0;currentPosition<S.length();currentPosition++){ // start at position 2
            if(isCurrentCharacterSameAsLast2(S, currentPosition)){

                // variable initialPositionOfSemiAlternating
                // holds the first position of the semi Alternating
                initialPositionOfSemiAlternating = currentPosition - 1;
            }

            // result in this case
            // keeps the longest found different between initial
            // and final ( semi Alternating ) in case we have more than 1
            // The usage of max is just to save one more if statement and variable in memory
            result = Math.max(result, currentPosition - initialPositionOfSemiAlternating + 1);


        }

        return result;
    }

    private boolean isCurrentCharacterSameAsLast2(String S, int i) {
        return S.charAt(i)==S.charAt(i-1) && S.charAt(i) == S.charAt(i-2);
    }

}
