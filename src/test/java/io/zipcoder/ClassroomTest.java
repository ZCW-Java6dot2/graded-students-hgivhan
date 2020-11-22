package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ClassroomTest {

    @Test
    public void testClassroom() {
        int expectedMaxStudents = 40;

        Classroom newClass = new Classroom(expectedMaxStudents);
        int actual = newClass.getStudents().length;
        //compare 2 ints, expected max and actual. get array out of class, get size

        Assert.assertEquals(expectedMaxStudents, actual);
    }

//    @Test
//    public void testGetStudents() {
//        Double[] st1 = {90.0, 90.0, 90.0};
//        Double[] st2 = {80.0, 90.0, 70.0};
//        Student student1 = new Student("John", "Doe", st1);
//        Student student2 = new Student("Mary", "Poppins", st2);
//        Student[] expectedStArr = {student1, student2};
//
//        Classroom classroom = new Classroom();
//
//        Student[] actual = classroom.getStudents();
//
//        Assert.assertEquals(expectedSt, actual);
//    }
//
//
//    @Test
//    public void setAvgExamScoresTest() {
//        Classroom classroom = new Classroom();
//        Double expectedAverage = 90.0;
//
//        Double actualAverage = classroom.getAverageExamScore();
//
//        Assert.assertEquals(expectedAverage, actualAverage);
//    }

    @Test
    public void addStudentTest() {
        //Given, when, then
        Classroom newClassroom = new Classroom(2);
        Student newStudent = new Student("John", "Doe", new Double[]{100.0});
        newClassroom.addStudent(newStudent);
        Student[] rollCall = newClassroom.getStudents();
        Assert.assertEquals(rollCall[0], newStudent);
        Assert.assertEquals(rollCall[1], null);
    }

//    @Test
//    public void addStudentTestFull() {
//        //Given, when, then
//        Classroom newClassroom = new Classroom(2);
//        Student newStudent = new Student("John", "Doe", new Double[]{100.0});
//        Student newStudent2 = new Student ("Jane", "Doe", new Double[]{95.0});
//        Student newStudent3 = new Student ("Mary", "Popo", new Double[]{99.0});
//        newClassroom.addStudent(newStudent);
//        newClassroom.addStudent(newStudent2);
//        newClassroom.addStudent(newStudent3);
//        Student[] rollCall = newClassroom.getStudents();
//        Assert.assertEquals(rollCall[2], null);
//    }


//    @Test
//    public void removeStudentTest(){
//        Double[] st1 = {90.0, 90.0, 90.0};
//        Double[] st2 = {80.0, 90.0, 70.0};
//        Student student1 = new Student("John", "Doe", st1);
//        Student student2 = new Student("Mary", "Poppins", st2);
//        Student[] expectedStArr = {student1, student2};
//
//        Classroom newClassroom = new Classroom(expectedStArr);
//        newClassroom.removeStudent("Mary", "Poppins");
//        Student[] actualStudentArr = newClassroom.getStudents();
//
//        Assert.assertEquals(expectedStArr, actualStudentArr);
//
//    }

//
//    @Test public void testGradeBook(){
//        Classroom classroom = new Classroom();
//        Student st1 = new Student("Sam", "Clark", new Double[]{100.0});
//        Student st2 = new Student("Sam", "Clark", new Double[]{89.0});
//        Student st3 = new Student("Sam", "Clark", new Double[]{70.0});
//        Student st4 = new Student("Sam", "Clark", new Double[]{64.0});
//        Student st5 = new Student("Sam", "Clark", new Double[]{44.0});
//        classroom.addStudent(st1);
//        classroom.addStudent(st2);
//        classroom.addStudent(st3);
//        classroom.addStudent(st4);
//        classroom.addStudent(st5);
//        Map<Student,String> expectedGradeBook = new HashMap();
//        expectedGradeBook.put(st1, "A");
//        expectedGradeBook.put(st2, "B");
//        expectedGradeBook.put(st3, "C");
//        expectedGradeBook.put(st4, "D");
//        expectedGradeBook.put(st5, "F");
//        Map<Student,String> actualGradeBook = classroom.getGradeBook();
//        Assert.assertEquals(expectedGradeBook.get(st1), actualGradeBook.get(st1));
//        Assert.assertEquals(expectedGradeBook.get(st2), actualGradeBook.get(st2));
//        Assert.assertEquals(expectedGradeBook.get(st3), actualGradeBook.get(st3));
//        Assert.assertEquals(expectedGradeBook.get(st4), actualGradeBook.get(st4));
//        Assert.assertEquals(expectedGradeBook.get(st5), actualGradeBook.get(st5));
//
//    }

}