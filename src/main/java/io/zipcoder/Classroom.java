package io.zipcoder;

import java.util.*;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents) {
        students = new Student[maxNumberOfStudents];

    }

    public Classroom(Student[] students) {
        students = students;

    }

    public Classroom() {
        students = new Student[30];

    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore() {
        double classAverage = 0.0;
        for (int i = 0; i < students.length; i++) {
            classAverage += students[i].getAverageExamScore();

        }
        return classAverage / students.length;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student; //add new student till i is null
                break;
            }
        }

    }

    public void removeStudent(String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                student.setFirstName(null);
                student.setLastName(null);
                for (int j = 0; j < student.getNumberOfExamsTaken(); j++) {
                    student.setExamScores(null);
                }
                break;
            } else {
                System.out.println("Student no longer taking this class.");
            }
        }
        Arrays.sort(students, new SortNulls());
    }

       //students is array we operate on, new Sort Nulls() is our comparator- instructions for the sort
            //we have to create comparator with instructions



        public Student[] getStudentsByScore() {
        Arrays.sort(students, new SortScore());
            return students;
    }

    public Map<Student, String> getGradeBook() {
        Classroom newC = new Classroom(); // make new classroom
        Student[] newCSize = newC.getStudentsByScore(); // get all students by score
        List<Student> newCList = Arrays.asList(newCSize); // make into arraylist
        ArrayList<String> gradeA = new ArrayList<>();
        ArrayList<String> gradeB = new ArrayList<>();
        ArrayList<String> gradeC = new ArrayList<>();
        ArrayList<String> gradeD = new ArrayList<>();
        ArrayList<String> gradeF = new ArrayList<>();
        String grade = "";
        HashMap<Student, String> returnMap = new HashMap<Student, String>();
        double indexA = newCList.size() * .91;
        double indexB = newCList.size() * .71;
        double indexC = newCList.size() * .51;
        double indexD = newCList.size() * .12;
        double indexF = newCList.size() * .01;

        for (Student s : newCList) {
            if (s.getAverageExamScore() >= indexA) {
                returnMap.put(s, "A");
            }
            else if (s.getAverageExamScore() >= indexB){
                returnMap.put(s, "B");
            }
            else if (s.getAverageExamScore() >= indexC){
                returnMap.put(s, "C");
            }
            else if (s.getAverageExamScore() >= indexD){
                returnMap.put(s, "D");
            }
            else {
                returnMap.put(s, "F");
            }
        }
        return returnMap;
    }
    }



        // get total # of students in class
        // get sorted student averages
        //loop through students
        // calculate percentiles
        //assign students to percentiles/letter grads
        // look at phonebook for mapping



    // create class that implements Comparator Interface
//type specified <>






//The class Classroom should define a method getStudentsByScore() which returns an array representation of Student objects sorted in descending order by score.
//If two students have the same class average, order them lexigraphically.
