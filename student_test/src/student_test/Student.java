package student_test;

import java.util.Arrays;


public class Student {

	

	    private String name;
	    private int[] scores;

	    public Student(String name, int numTests) {
	        this.name = name;
	        this.scores = new int[numTests];
	    }

	    public String getName() {
	        return name;
	    }

	    public void setScore(int testIndex, int score) {
	        if (testIndex >= 0 && testIndex < scores.length) {
	            scores[testIndex] = score;
	        }
	    }

	    public int getScore(int testIndex) {
	        if (testIndex >= 0 && testIndex < scores.length) {
	            return scores[testIndex];
	        }
	        return -1; 	    }

	    public int[] getScores() {
	        return scores;
	    }

	    @Override
	    public String toString() {
	        return "Student{name='" + name + "', scores=" + Arrays.toString(scores) + '}';
	    }
	}


