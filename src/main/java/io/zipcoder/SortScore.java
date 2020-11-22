package io.zipcoder;

import java.util.Comparator;

public class SortScore implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1 == null && s2 == null) {
            return 0;
        }
        else if (s1.getAverageExamScore() == s2.getAverageExamScore()){
            return s1.getLastName().compareTo(s2.getLastName());
        }
        else if (s1.getAverageExamScore() < s2.getAverageExamScore()){
            return 1;
        }
        else if (s1.getAverageExamScore() > s2.getAverageExamScore()){
            return -1;
        }
        else { return 0; }
    }


}