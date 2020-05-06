package org.mattos.sandbox.algorithms.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DetermingDNAHealth {


    public static Integer[] evaluateDNA(String[] genes, int[] health, List<DataPoint> dataPoints){

        Integer weakest = -1;
        Integer strongest = 0;

        for (DataPoint dataPoint: dataPoints) {
            Integer healthScore = 0;
            for (int i = dataPoint.rangeBeginning; i <= dataPoint.rangeEnding; i++) {
                int indexFound = dataPoint.getSequence().indexOf(genes[i]);

                 while (indexFound >= 0){
                     healthScore+=health[i];
                     indexFound = dataPoint.getSequence().indexOf(genes[i], indexFound+1);
                 }
            }

            if(healthScore>strongest) strongest = healthScore;
            else if (healthScore<weakest||weakest==-1) weakest = healthScore;

        }

        return new Integer[]{weakest,strongest};
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] genes = new String[n];

        String[] genesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String genesItem = genesItems[i];
            genes[i] = genesItem;
        }

        int[] health = new int[n];

        String[] healthItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int healthItem = Integer.parseInt(healthItems[i]);
            health[i] = healthItem;
        }

        int s = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<DataPoint> dataPoints = new ArrayList<>();
        for (int sItr = 0; sItr < s; sItr++) {
            String[] firstLastd = scanner.nextLine().split(" ");

            int first = Integer.parseInt(firstLastd[0]);

            int last = Integer.parseInt(firstLastd[1]);

            String d = firstLastd[2];

            dataPoints.add(new DataPoint(first, last, d));

        }

        scanner.close();

        Integer[] diagnosis = evaluateDNA(genes, health, dataPoints);
        System.out.println(diagnosis[0] + " " + diagnosis[1]);

    }

    public static class DataPoint{

        private int rangeBeginning;
        private int rangeEnding;
        private String sequence;

        public DataPoint(int rangeBeginning, int rangeEnding, String sequence){
            this.rangeBeginning = rangeBeginning;
            this.rangeEnding = rangeEnding;
            this.sequence = sequence;
        }

        public int getRangeBeginning(){
            return rangeBeginning;
        }

        public int getRangeEnding(){
            return rangeEnding;
        }

        public String getSequence(){
            return sequence;
        }

    }
}
