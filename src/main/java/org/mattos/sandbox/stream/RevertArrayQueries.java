package org.mattos.sandbox.stream;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class RevertArrayQueries {


    public List<Integer> revertArray(List<Integer> arr, List<List<Integer>> commands){

        for (List<Integer> command:commands
             ) {
            reverseInterval(arr, command.get(0), command.get(1));
        }

        return arr;
    }

    private void reverseInterval(List<Integer> arr, int begining, int end){
        Collections.reverse(arr.subList(begining, end+1));
    }




}
