package org.mattos.sandbox.algorithms.strings;

public class SeparateNumbers     {

    // Complete the separateNumbers function below.
    public static String separateNumbers(String s) {
        String tentativeNumber = "";
        if(!s.isEmpty() && !s.startsWith("0")) {

            for (int i = 1; i <= s.length()/2; i++) {
                Long firstNumber = Long.valueOf(s.substring(0,i));
                StringBuilder sequence = new StringBuilder();
                Long nextNumber = firstNumber;
                do{
                    sequence.append(nextNumber);
                    nextNumber++;
                } while (sequence.length() < s.length());

                if(sequence.toString().equals(s)){
                    return "YES " + firstNumber;
                }
            }
        } else return "NO";
        return "NO";
    }
}
