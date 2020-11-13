package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<Double>(Arrays.asList(testScores));
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getExamScores() {
        String examScoresString = "Exam Scores:\n";

        for (int i = 0; i < examScores.size(); i++) {
            examScoresString += String.format("\tExam %d -> %.1f\n", i + 1, examScores.get(i)); //i+1 makes %d start at 1 rather than 0
//examScore.get(i)) tells the loop to take the index it's at and format it in the string
        }
        return examScoresString;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setExamScores(String examScores) {
    }

    public int getNumberOfExamsTaken(){
        return examScores.size();
        }

    public void addExamScore(double examScore) {
        examScores.add(examScore);
        }

    public Double getAverageExamScore(){
        double sum = 0;
        for(Double scores : examScores) {
            sum += scores;
        }
            return sum/examScores.size();
        }

    public String studentToString(){
        return String.format("Student Name: %s %s\n> Average Score: %3.1f\n>", getFirstName(), getLastName(), getAverageExamScore()) + getExamScores();
    }
}







//\t is for tabbing in, \n is for entering to a new line
// %d does the number
//%.1f shows form you want it, .1f gives 1 decimal point. can do 0f if you don't want any decimals

