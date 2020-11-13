package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    String newStudent;

    @Test
    public void studentTest() {
        String expectedFirstName = "Hillary";
        String expectedLastName = "Givhan";
        Double[] expectedExamScores = {90.00, 85.00, 70.00};
        String expectedExamScoresAsString = "Exam Scores:\n\tExam 1 -> 90.0\n" + "\tExam 2 -> 85.0\n" + "\tExam 3 -> 70.0\n";


        Student newStudent = new Student(expectedFirstName, expectedLastName, expectedExamScores);
        String actualFirstName = newStudent.getFirstName();
        String actualLastName = newStudent.getLastName();
        String actualExamScores = newStudent.getExamScores();

        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedExamScoresAsString, actualExamScores);
    }

    @Test
    public void setFirstName() {
        String expectedFirstName = "Hillary";

        Student newStudent = new Student(expectedFirstName, "", new Double[0]);
        String actualFirstName = newStudent.getFirstName();

        Assert.assertEquals(expectedFirstName, actualFirstName);
    }

    @Test
    public void setLastName() {
        String expectedLastName = "Givhan";

        Student newStudent = new Student("", expectedLastName, new Double[0]);
        String actualLastName = newStudent.getLastName();

        Assert.assertEquals(expectedLastName, actualLastName);
    }

    @Test
    public void testExamScores() {
        String expectedExamScores = "Exam Scores:\n\tExam 1 -> 90.0\n" + "\tExam 2 -> 85.0\n" + "\tExam 3 -> 70.0\n";

        Student newStudent = new Student("", "", new Double[]{90.0, 85.0, 70.0});
        String actualExamScores = newStudent.getExamScores();

        Assert.assertEquals(expectedExamScores, actualExamScores);
    }

    @Test
    public void getNumberOfExamsTest(){
        Student student = new Student(null, null, new Double[]{90.0, 85.0, 70.0});
        int expectedNumber = 3;

        int actualNumber = student.getNumberOfExamsTaken();

        Assert.assertEquals(expectedNumber,actualNumber);

    }

    @Test
    public void addExamScoresTest(){
        Student student = new Student("John", "Doe", new Double[]{});
        String expectedReturn = "Exam Scores:\n" + "\tExam 1 -> 85.0\n";

        student.addExamScore(85.0);
        String actualReturn = student.getExamScores();

        Assert.assertEquals(expectedReturn, actualReturn);
    }

    @Test
    public void setAvgExamScoresTest(){
        Student student = new Student(null, null, new Double[]{80.00, 100.00});
        Double expectedAverage = 90.0;

        Double actualAverage = student.getAverageExamScore();

        Assert.assertEquals(expectedAverage, actualAverage);

    }

    @Test
    public void toStringTest(){
        Student student = new Student("Mackensie", "Blair", new Double[]{100.0});
        String expectedOutput = "Student Name: Mackensie Blair\n> Average Score: 100.0\n>Exam Scores:\n\tExam 1 -> 100.0\n";

        String actualOutput = student.studentToString();

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    }

