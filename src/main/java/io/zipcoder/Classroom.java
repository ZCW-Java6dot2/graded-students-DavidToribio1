package io.zipcoder;

import java.util.*;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];

    }

    public Classroom(Student[] student) {
       students = student;

    }

    //Nullary Constructor
    public Classroom() {
        students = new Student[30];

    }

    public Student[] getStudents() {
        return students;

    }

    public Student[] getStudentsByScore() {
        ArrayList<Student> order = new ArrayList<>();
        for (Student s : students) {
            order.add(s);

        }
        Collections.sort(order, new Sortbylastname());
        Collections.sort(order, new Sortbygrade());
        return order.toArray(new Student[students.length]);
    }

    public double getAverageExamScore() {
        double sum = 0;
        int studentScore = 0;
        for (Student d : students) {
            sum += d.getAverageExamScore();
            studentScore++;
        }
        return sum / studentScore;
    }




    public void addStudent(Student student) {
        Student[] newStudents = new Student[students.length+1];
        int index = 0;
        for (Student d : students){
            newStudents[index] = d;
            index++;
        }
        newStudents[newStudents.length-1] = student;
        students = newStudents;
            }




    public void removeStudent(String firstName, String lastName) {
        int count = 0;
        for (Student x : this.students) {
            if (x.getFirstName() == firstName && x.getLastName() == lastName) {
                break;
            }
            count++;

        }


    }


        public HashMap<Character, ArrayList<Student>> getGradebook () {
            HashMap<Character, ArrayList<Student>> studentGrademap = new HashMap<>();
            ArrayList<Student> StudentsA = new ArrayList<>();
            ArrayList<Student> StudentsB = new ArrayList<>();
            ArrayList<Student> StudentsC = new ArrayList<>();
            ArrayList<Student> StudentsD = new ArrayList<>();
            ArrayList<Student> StudentsF = new ArrayList<>();
            Double highestGrade = this.getStudentsByScore()[0].getAverageExamScore();
            for (Student x : students) {
                if (x.getAverageExamScore() >= highestGrade * 0.9) {
                    StudentsA.add(x);
                } else if (x.getAverageExamScore() < highestGrade * 0.9 && x.getAverageExamScore() > highestGrade * 0.7) {
                    StudentsB.add(x);
                } else if (x.getAverageExamScore() <= highestGrade * 0.7 && x.getAverageExamScore() > highestGrade * 0.5) {
                    StudentsC.add(x);
                } else if (x.getAverageExamScore() <= highestGrade * 0.5 && x.getAverageExamScore() > highestGrade * 0.1) {
                    StudentsD.add(x);
                } else {
                    StudentsF.add(x);
                }


                studentGrademap.put('A', StudentsA);
                studentGrademap.put('B', StudentsB);
                studentGrademap.put('C', StudentsC);
                studentGrademap.put('D', StudentsD);
                studentGrademap.put('F', StudentsD);


            }

        return studentGrademap;

}

}
