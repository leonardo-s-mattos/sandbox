package org.mattos.sandbox.algorithms.strings;

public class HackerrankInAString {

    // Complete the hackerrankInString function below.
    public static String hackerrankInString(String s) {


        int[] lettersPositions = new int[10];
        lettersPositions[0] = s.indexOf("h");
        lettersPositions[1] = s.indexOf("a", lettersPositions[0]);
        lettersPositions[2] = s.indexOf("c", lettersPositions[1]);
        lettersPositions[3] = s.indexOf("k", lettersPositions[2]);
        lettersPositions[4] = s.indexOf("e", lettersPositions[3]);
        lettersPositions[5] = s.indexOf("r", lettersPositions[4]);
        lettersPositions[6] = s.indexOf("r", lettersPositions[5]+1);
        lettersPositions[7] = s.indexOf("a", lettersPositions[6]);
        lettersPositions[8] = s.indexOf("n", lettersPositions[7]);
        lettersPositions[9] = s.indexOf("k", lettersPositions[8]);

        // reconstruct word
        String reconstructed = "";
        for (int i = 0; i < 10; i++)
            if(lettersPositions[i] >-1)
                reconstructed += s.charAt(lettersPositions[i]);

        if("hackerrank".equals(reconstructed)) return "YES";
        else return "NO";
    }
}
