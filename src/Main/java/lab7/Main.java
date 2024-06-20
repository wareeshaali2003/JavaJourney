package Main.java.lab7;
import java.util.Scanner;

class Student {
    // Attributes
    private String name;
    private int totalMarks;
    private int obtainedMarks;
    private double percentage;
    private String grade;
    private double GPA;

    // Constructor
    public Student(String name, int totalMarks, int obtainedMarks) {
        this.name = name;
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtainedMarks;
        calculatePercentage();
        calculateGrade();
        calculateGPA();
    }

    // Method to calculate percentage
    private void calculatePercentage() {
        percentage = ((double) obtainedMarks / totalMarks) * 100;
    }

    // Method to calculate grade
    private void calculateGrade() {
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    // Method to calculate GPA
    private void calculateGPA() {
        switch (grade) {
            case "A":
                GPA = 4.0;
                break;
            case "B":
                GPA = 3.0;
                break;
            case "C":
                GPA = 2.0;
                break;
            case "D":
                GPA = 1.0;
                break;
            default:
                GPA = 0.0;
                break;
        }
    }

    // Method to display the mark sheet
    public void displayMarkSheet() {
        System.out.println("----- Mark Sheet -----");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.printf("GPA: %.1f\n", GPA);
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter total marks: ");
        int totalMarks = scanner.nextInt();

        System.out.print("Enter obtained marks: ");
        int obtainedMarks = scanner.nextInt();

        // Create an instance of Student
        Student student = new Student(name, totalMarks, obtainedMarks);

        // Display the mark sheet
        student.displayMarkSheet();

        scanner.close();
    }
}
