package org.mattos.sandbox.algorithms.implementation;

public class Kangoroo {


    // Complete the kangaroo function below.
    static String jump(int x1, int v1, int x2, int v2) {

        String result = "YES";
        if(x2 > x1 && v2 > v1) result = "NO";
        else {
            int currentPositionK1 = x1;
            int currentPositionK2 = x2;
            while (currentPositionK1 < currentPositionK2) {
                currentPositionK1 += v1;
                currentPositionK2 += v2;
            }

            result = currentPositionK1 == currentPositionK2?"YES":"NO";
        }
        return result;
    }

}
