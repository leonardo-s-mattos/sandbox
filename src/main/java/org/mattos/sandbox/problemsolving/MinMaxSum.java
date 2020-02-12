package org.mattos.sandbox.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxSum {

    public List<String> sum(int[] arr){

        if(arr.length<5) return null;

        List<Long> unfilteredResult = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            Long partialSum = Long.valueOf(0);
            for(int j = 0; j < arr.length; j++){
                if(j != i){
                   partialSum = Long.sum(partialSum, Long.valueOf(arr[j]));
                }
            }
            unfilteredResult.add(partialSum);
        }

        return Arrays.asList(new String[]{String.valueOf(unfilteredResult.stream().mapToLong(v->v).min().getAsLong())
                , String.valueOf(unfilteredResult.stream().mapToLong(v->v).max().getAsLong())});
    }
}
