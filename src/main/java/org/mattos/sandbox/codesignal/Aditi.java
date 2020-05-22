package org.mattos.sandbox.codesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Aditi {

    boolean checkBlanagrams(String word1, String word2) {

        return countSubstitutions(word1, word2, 0,0)==1;

    }

    private int countSubstitutions(String word1, String word2, int position, int subs){

        List<String> lettersWord1 = Arrays.stream(word1.split("")).sorted().collect(Collectors.toList());
        List<String> lettersWord2 = Arrays.stream(word2.split("")).sorted().collect(Collectors.toList());

        if(String.valueOf(lettersWord1).equals(String.valueOf(lettersWord2)) ||
                position == word1.length()) return subs;

        if (!(word1.charAt(position) == word2.charAt(position))) subs++;

        return countSubstitutions(word1,
                new StringBuilder(word2).replace(position, position+1, String.valueOf(word1.charAt(position))).toString(),
                position+1,
                subs);
    }

}
