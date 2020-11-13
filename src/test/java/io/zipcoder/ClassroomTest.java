package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class ClassroomTest {

    @Test
    public void testClassroom(){
        int expectedMaxStudents = 40;

        Classroom newClass = new Classroom(expectedMaxStudents);
        int actual = newClass.getStudents().length;
        //compare 2 ints, expected max and actual. get array out of class, get size

        Assert.assertEquals(expectedMaxStudents, actual);
    }

    @Test
    public void testGetStudents(){
        Classroom classroom = new Classroom();
        Student[] expected = new Student[]{"Jo Jo", "Fi Fi", "Mar Mar", "Goo Goo", "Rui Rui"};

        Student[] actual = classroom.getStudents();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAvgExamScoresTest(){
        Classroom classroom = new Classroom();
        Double expectedAverage = 90.0;

        Double actualAverage = student.getAverageExamScore();

        Assert.assertEquals(expectedAverage, actualAverage);


    @Test public void testGradeBook(){




    }


//    @Test
//    public void testGetStudents() {
//        Student[] expectedArr = {};
//        Classroom newClass = new Classroom();
//    }
}

//    public Student[] getStudents(){return students;}
//
//    public Double getAverageExamScore(){
//
//
//
//    public void addStudent(Student student){
//
//
//    public void removeStudent(String firstName, String lastName){
//
//
//class SortNulls implements Comparator<Student> {
//    public int compare(Student s1, Student s2){
//
//
//}
//
//class sortScore implements Comparator<Student> {
//    public int compare(Student s1, Student s2) {
//
//}

