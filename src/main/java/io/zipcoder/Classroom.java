package io.zipcoder;

import java.util.*;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];

    }

    public Classroom(Student[] students){
        this.students = students;

    }

    public Classroom(){
        this.students = new Student[30];

    }

    public Student[] getStudents(){return students;}

    public Double getAverageExamScore(){
        double classAverage = 0.0;
        for (int i = 0; i < students.length; i++){
            classAverage += students[i].getAverageExamScore();

        }
        return classAverage / students.length;
    }

    public void addStudent(Student student){
        for(int i = 0; i < students.length; i++){
            if (students[i] == null) {
                students[i] = student; //add new student well i is null
                break;
            } else{
                System.out.println("Classroom full, try again later.");
            }

            }
        }

        public void removeStudent(String firstName, String lastName){
        for(int i = 0; i < students.length; i++){
            if (students[i].getFirstName() == firstName && students[i].getLastName() == lastName){
                students[i] = null;
            } else {
                System.out.println("Student no longer taking this class.");
            }
        }
        Arrays.sort(students, new SortNulls()); //students is array we operate on, new Sort Nulls() is our comparator- instructions for the sort
            //we have to create comparator with instructions

        }

        public Student[] getStudentsByScore() {
        Arrays.sort(students, new SortScore());
            return students;
    }

//    public Map<Student, String> getGradeBook(){
//        Classroom newC = new Classroom(); // make new classroom
//        Student[] newCSize = newC.getStudentsByScore(); // get all students by score
//        List <Student> newCList = Arrays.asList(newCSize); // make into arraylist
//        ArrayList <String> gradeA = new ArrayList<>();
//        ArrayList <String> gradeB = new ArrayList<>();
//        ArrayList <String> gradeC = new ArrayList<>();
//        ArrayList <String> gradeD = new ArrayList<>();
//        ArrayList <String> gradeF = new ArrayList<>();
//        String grade = "";
//        LinkedHashMap<Student,String> returnMap = new LinkedHashMap<Student, String>();
//
//        for(Student s : students){
//            if








        // get total # of students in class
        // get sorted student averages
        //loop through students
        // calculate percentiles
        //assign students to percentiles/letter grads
        // look at phonebook for mapping


    }
    // create class that implements Comparator Interface
//type specified <>

    class SortNulls implements Comparator<Student> {
        public int compare(Student s1, Student s2){
    if (s1 == null && s2 == null) {
        return 0;
        // if both null, no moving here, so return 0 to tell sorter not to remove them
        }
    if (s1 == null){
        return 1;
        // tells sorter to push null to the right
        }
    if (s2 == null){
        return -1;
        //tells sorter to move null to the right, if null is on left, gotta use -1 saying it's less than, sorting based on greater less than
        }
    // if neither are null, they can stay put
        return 0;
    }

}

    class SortScore implements Comparator<Student> {
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


//The class Classroom should define a method getStudentsByScore() which returns an array representation of Student objects sorted in descending order by score.
//If two students have the same class average, order them lexigraphically.
