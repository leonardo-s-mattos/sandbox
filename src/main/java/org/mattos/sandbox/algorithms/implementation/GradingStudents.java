package org.mattos.sandbox.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static List<Integer> roundGrades(List<Integer> grades) {

        List<Integer> roundedGrades = new ArrayList<>();

        for (Integer originalGrade : grades) {
            if(originalGrade < 38 || originalGrade % 5 < 3) roundedGrades.add(originalGrade);
            else roundedGrades.add(originalGrade - (originalGrade % 5) + 5);
        }

        return roundedGrades;
    }

}
