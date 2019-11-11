package org.mattos.sandbox;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public List<Integer> factorOf(Integer givenNumber){

        Integer remainder = givenNumber;
        List<Integer> result = new ArrayList<Integer>();
        Integer divisor = 2;
        while(remainder>1){
            while (remainder%divisor==0){
                result.add(divisor);
                remainder/=divisor;
            }
            divisor++;
        }
        return result;

    }
}
