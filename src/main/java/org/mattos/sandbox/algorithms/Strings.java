package org.mattos.sandbox.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Strings {

    public String[] findStrings(String[] givenStrings, int[] queries){

        List<String> subsequences = new ArrayList<>();
        List<String> queryResults = new ArrayList<>();
        for (String item:
             givenStrings) {
            subsequences.addAll(splitIntoSubstrings(item));
        }

        subsequences = subsequences.stream().distinct().sorted().collect(Collectors.toList());

        for (int query:
             queries ) {

            if(query <= subsequences.size())
                queryResults.add(subsequences.get(query-1));
            else
                queryResults.add("INVALID");
        }
        return queryResults.toArray(new String[0]);
    }

    private List<String> splitIntoSubstrings(String str){

        List<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                result.add(str.substring(i,j));
            }
        }
       /*
        if(s.length()==0) {
            result.add(ans);
            return result;
        }

        result.addAll(splitIntoSubstrings(s.substring(1),ans+s.charAt(0))) ;
        result.addAll(splitIntoSubstrings(s.substring(1),ans));
        */

        return result;
    }
}
