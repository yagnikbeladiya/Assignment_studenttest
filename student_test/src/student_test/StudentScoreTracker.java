package student_test;

import java.util.ArrayList;
import java.util.Scanner;



	
	
	

	public class StudentScoreTracker {
	    private ArrayList<Student> students;
	    private int numTests;

	    public StudentScoreTracker(int numTests) {
	        this.students = new ArrayList<>();
	        this.numTests = numTests;
	    }

	    public void addStudent(String name) {
	        students.add(new Student(name, numTests));
	    }

	    public void setStudentScore(String name, int testIndex, int score) {
	        for (Student student : students) {
	            if (student.getName().equals(name)) {
	                student.setScore(testIndex, score);
	                return;
	            }
	        }
	        System.out.println("Student not found.");
	    }

	    public void displayScores() {
	        for (Student student : students) {
	            System.out.println(student);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of tests: ");
	        int numTests = scanner.nextInt();
	        scanner.nextLine();
	        StudentScoreTracker tracker = new StudentScoreTracker(numTests);

	        while (true) {
	            System.out.println("1. Add Student");
	            System.out.println("2. Set Student Score");
	            System.out.println("3. Display Scores");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            int option = scanner.nextInt();
	            scanner.nextLine();
	            switch (option) {
	                case 1:
	                    System.out.print("Enter student name: ");
	                    String name = scanner.nextLine();
	                    tracker.addStudent(name);
	                    break;
	                case 2:
	                    System.out.print("Enter student name: ");
	                    name = scanner.nextLine();
	                    System.out.print("Enter test index (0-based): ");
	                    int testIndex = scanner.nextInt();
	                    System.out.print("Enter score: ");
	                    int score = scanner.nextInt();
	                    scanner.nextLine(); 
	                    tracker.setStudentScore(name, testIndex, score);
	                    break;
	                case 3:
	                    tracker.displayScores();
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }
	    }
	


}
