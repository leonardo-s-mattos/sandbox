package org.mattos.sandbox.problemsolving;


import java.util.*;



public class Staircase {

    // Complete the staircase function below.
    public String build(int n) {

        String spaceRepeated = "";
        String hashtagRepeated = "";
        StringBuilder result = new StringBuilder();
        for(int i=1; i<=n;i++){
            spaceRepeated = String.join("", Collections.nCopies(n-i, " "));
            hashtagRepeated = String.join("", Collections.nCopies(i, "#"));
            result.append(spaceRepeated).append(hashtagRepeated).append("\n");
        }

        return result.toString();
    }


}

