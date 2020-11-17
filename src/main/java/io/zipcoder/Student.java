package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
     private    String firstName;
       private String lastName;
        private ArrayList<Double> examScores;

        //student Constructor
        public Student (String firstName, String lastName, Double[] examScores) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.examScores = new ArrayList<Double>(Arrays.asList(examScores));

        }


        //getters
        public String getFirstName(){
                return firstName;

        }
        public String getLastName(){

                return lastName;

        }
        //setters
        public void setLastName(String lastName){
        this.lastName =lastName;

        }
        public void setFirstName(String firstName){
                this.firstName = firstName;
        }

        public int getNumberOfExamsTaken(){
            int numberOfExamsTaken = examScores.size();
            return numberOfExamsTaken;
        }




        public String getExamScores() {
                        String examScoresEnding = "Exam Scores: \n";
                        for (int i = 0; i < examScores.size(); i++) {
                                examScoresEnding += String.format("\tExam %d -> %.0f\n", i + 1, examScores.get(i));
                        }
                        return examScoresEnding;

        }
        public double getAverageExamScore() {
                Double totalScore = 0.0;
                for (Double b: examScores) {
                        totalScore += b;
                }
                return totalScore/examScores.size();

        }


        public void addExamScore(double examScore){
                examScores.add(examScore);

        }
        public void setExamScore(int examNum , double newScore){
                examScores.add(examNum -1, newScore);

        }

        @Override
        public String toString(){
                String output ="Student Name: " + this.firstName + " " + this.lastName+ "\n";
                output += "> Average Score: " + this.getAverageExamScore() + "\n";
                output += "> "+ this.getExamScores();
                return output;


        }

        }













