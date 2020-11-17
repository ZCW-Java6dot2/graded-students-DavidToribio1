package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.Target;
import java.sql.Struct;
import java.util.ArrayList;

public class StudentTest {
    @Test
    public void studentConstructorTest(){
        //Given
        String expectedFirstName = "David";
        String expectedLastName = "Toribio";
        Double[] expectedExamScores ={100.0, 95.0};
        String expectedExamScoresString = "Exam Scores: \n" + "\tExam 1 -> 100\n" + "\tExam 2 -> 95\n";
        Student students = new Student(expectedFirstName, expectedLastName, expectedExamScores);
        //when

        String actualFirstName  = students.getFirstName();
        String actualLastName = students.getLastName();
        String actualExamScores = students.getExamScores();

        //Then
        Assert.assertEquals(expectedFirstName,actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedExamScoresString,actualExamScores);

    }
        @Test
        public void setFirstNameTest() {
            //Given
            String expectedFirstName = "David";
            Student student = new Student(expectedFirstName,"", new Double[0]);
            //when

            student.setFirstName(expectedFirstName);
            String actualFirstName  = student.getFirstName();

            //then
            Assert.assertEquals(expectedFirstName,actualFirstName);

        }
        @Test
        public void setLastNameTest(){
        //given
        String expectedLastName ="Toribio";
        Student student = new Student("",expectedLastName, new Double[0]);

        //when
        student.setLastName(expectedLastName);
        String actualLastName = student.getLastName();


        //then
        Assert.assertEquals(expectedLastName,actualLastName);
        }

        @Test
        public void getExamScoresTest(){
        //given
        String expectedExamScores = "Exam Scores: \n" + "\tExam 1 -> 100\n" + "\tExam 2 -> 95\n";
        Student student = new Student(null, null, new Double[]{100.0, 95.0});

        //when
        String actualExamScores = student.getExamScores();

        //then
        Assert.assertEquals(expectedExamScores,actualExamScores);
        }
        @Test
        public void getNumberOfExamsTest(){
        //given
        Student student = new Student(null,null, new Double[]{95.0,88.0,77.0});
        int expectedNumberOfExams = 3;

        //when
        int actualNumberOfExams = student.getNumberOfExamsTaken();

        //then
        Assert.assertEquals(expectedNumberOfExams,actualNumberOfExams);


    }
        @Test
        public void addExamScoreTest(){
        //given
        Student student = new Student("Bob", "Miller", new Double[]{});
        String expectedResult = "Exam Scores: \n" + "\tExam 1 -> 99\n";

        //when
        student.addExamScore(90.0);
        String actualResult = student.getExamScores();

        //then
        Assert.assertEquals(expectedResult,actualResult);
        }

        @Test
        public void setExamScoresTest(){
        //given
        Student student = new Student(null,null, new Double[]{});
        String expectedResult = "Exam Scores: \n" + "\tExam 1 -> 150\n";

        //when
        student.setExamScore(1,150.0);
        String actualResult = student.getExamScores();

        //then
        Assert.assertEquals(expectedResult,actualResult);

        }
        @Test
        public void getAverageExamScoreTest(){
        //given
        Student student = new Student (null, null, new Double[]{100.0,50.0});
        Double expectedAverage = 75.0;

        //when
        Double actualAverage = student.getAverageExamScore();

        //then
        Assert.assertEquals(expectedAverage,actualAverage);

        }
        @Test
        public void toStringTest(){
        //given
        Student student = new Student("David", "Toribio", new Double[]{100.0});
        String expectedResult ="Student Name: David Toribio\n> Average Score: 100.0\n> Exam Scores: \n\tExam 1 -> 100\n";

        //when
        String actualResult = student.toString();

        //then
        Assert.assertEquals(expectedResult,actualResult);
        }

        }
