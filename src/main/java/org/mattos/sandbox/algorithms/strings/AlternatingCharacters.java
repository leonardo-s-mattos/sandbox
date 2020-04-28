package org.mattos.sandbox.algorithms.strings;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class AlternatingCharacters {

    private static final String CONSECUTIVE_A_CHARACTERS =  "([A\\d])\\1";
    private static final String CONSECUTIVE_B_CHARACTERS = "([B\\d])\\1";

    // Complete the alternatingCharacters function below.
    public static int requiredDeletions(String s) {

/*
        List<String> letters = Arrays.stream(s.split("")).collect(Collectors.toList());

        String result = letters.stream().reduce((a,b)-> {
                if(a.endsWith(b)) return a;
                 else return a+b;
            }).get();
*/

       String result = replaceDuplicates(CONSECUTIVE_A_CHARACTERS, "A", s);
        result = replaceDuplicates(CONSECUTIVE_B_CHARACTERS, "B", result);

        return s.length() - result.length();
    }

    private static String replaceDuplicates(String regex, String character, final String original){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(original);
        if(original.isEmpty() || !matcher.find()) return original;

        return replaceDuplicates(regex, character, matcher.replaceAll(character));

    }
}
