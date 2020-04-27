package org.mattos.sandbox.algorithms.strings;

import java.util.ArrayList;
import java.util.List;

public class WeightedUniformStrings {

    int[] weightedStrings;
    private final long start;

    private double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

    static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public WeightedUniformStrings(String uniformStrings){
        start = System.currentTimeMillis();
        weightedStrings = splitStringByCharacter(uniformStrings);

        System.out.println(elapsedTime());
    }

    private int[] splitStringByCharacter(String string){

        int[] resultWeights = new int[string.length()];
        int counter=0;
        for (int pointer = 0; pointer < string.length(); pointer++){
            resultWeights[pointer]=((alphabet.indexOf(string.charAt(pointer))+1) * (counter+1));
            counter++;
            if (pointer == string.length() - 1
                    || string.charAt(pointer) != string.charAt(pointer + 1)) {
                counter=0;
            }
        }

        return resultWeights;
    }

    // Complete the weightedUniformStrings function below.
    public String[] areElementsOfPossible( int[] queries) {

        String[] result = new String[queries.length];

        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < weightedStrings.length; j++) {
                if(queries[i]==weightedStrings[j]){
                    result[i] = "Yes";
                    break;
                }
                result[i] = "No";
            }
        }

        return result;
    }
}
