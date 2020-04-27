package org.mattos.sandbox.algorithms.strings;

public class Pangrams {

    // Complete the pangrams function below.
    public static String pangrams(String phrase) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        if(phrase.length()<26) return "not pangram";

        String[] letters = alphabet.split("");
        for (String letter: letters)
            if(!(phrase.contains(letter) || phrase.contains(letter.toUpperCase()))) return "not pangram";

        return  "pangram";
    }
}
