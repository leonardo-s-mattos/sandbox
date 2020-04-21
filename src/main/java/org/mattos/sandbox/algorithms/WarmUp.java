package org.mattos.sandbox.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WarmUp {


    //calculate the absolute difference between the sums of its diagonals
    int diagonalsDifference(List<List<Integer>> matrix){

        Integer upwardSum = 0,  downwardSum = 0;

        for (int i = 0; i < matrix.size(); i++) {
            upwardSum+= matrix.get(matrix.size()-1-i).get(i);
            downwardSum+=matrix.get(i).get(i);
        }

        return Math.abs(upwardSum-downwardSum);
    }

    //Given an array of integers, calculate the fractions of
    // its elements that are positive, negative, and are zeros.
    // Print the decimal value of each fraction on a new line.
    void plusMinus(int[] arr){

        Double base = Double.valueOf(arr.length);

        print(String.valueOf(
                Double.valueOf(Arrays.stream(arr).filter(x -> x > 0 ).count())
                        / base)
        );
        print(String.valueOf(
                Double.valueOf(Arrays.stream(arr).filter(x -> x < 0 ).count())
                        / base)
        );
        print(String.valueOf(
                Double.valueOf(Arrays.stream(arr).filter(x -> x == 0 ).count())
                        / base)
        );

    }

    //Given a time in -hour AM/PM format, convert it to military (24-hour) time.
    String timeConversion(String s){

        String postfix = s.substring(s.length()-2);
        String[] time = s.substring(0,s.length()-2).split("\\s*:\\s*");

        if(time.length != 3) return null;

        if(isAfterNoonHours(postfix, time[0])){
            time[0] = String.valueOf(Integer.valueOf(time[0]) + 12);
        }

        if(isMidnight(postfix, time[0])){
            time[0] = "00";
        }


        return time[0] + ":" + time[1] + ":" + time[2];

    }

    private boolean isAfterNoonHours(String postfix, String hour) {
        return "PM".equals(postfix) && !"12".equals(hour);
    }

    private boolean isMidnight(String postfix, String hour) {
        return "AM".equals(postfix) && "12".equals(hour);
    }

    private void print(String messageToBePrinted){
        System.out.println(messageToBePrinted);
    }
}
