package org.mattos.sandbox.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Strings {

    private static final String CONSECUTIVE_CHARACTERS = "([a-z\\d])\\1";
    private static final String UPPERCASE = "([A-Z])";
    private static final String LOWERCASE = "([a-z])";
    private static final String NUMBERS = "([0-9])";
    private static final String SPECIALS_CHARACTERS = "([!@#$%^&*()\\-\\+])";

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

    public String superReducedString(final String s) {

        String reducedString = removeConsecutiveCharacters(s);
        if(reducedString.isEmpty()) reducedString = "Empty String";
        return reducedString;
    }

    private String removeConsecutiveCharacters( final String original){
        Pattern pattern = Pattern.compile(CONSECUTIVE_CHARACTERS);

        Matcher matcher = pattern.matcher(original);
        if(original.isEmpty() || !matcher.find()) return original;

        return removeConsecutiveCharacters(matcher.replaceAll(""));
    }

    public int camelcase(String s) {

        if(s.isEmpty()) return 0;
        String[] words = s.split(UPPERCASE);
        return words.length;

    }

    public int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int need = 0;

        if(!findCharacters(password, UPPERCASE)) need++;
        if(!findCharacters(password, LOWERCASE)) need++;
        if(!findCharacters(password, NUMBERS)) need++;
        if(!findCharacters(password, SPECIALS_CHARACTERS)) need++;
        if(6 > (n + need)) need+= 6 - (n+need);

        return need;
    }

    private boolean findCharacters( final String original, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(original);
        return matcher.find() ;
    }
}
