package Main.java.lab4;

import java.util.Scanner;

public class task1 {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter marks for the first subject
        System.out.print("Enter marks obtained in subject 1: ");
        int marks1 = scanner.nextInt();
        
        // Prompt the user to enter marks for the second subject
        System.out.print("Enter marks obtained in subject 2: ");
        int marks2 = scanner.nextInt();
        
        // Prompt the user to enter marks for the third subject
        System.out.print("Enter marks obtained in subject 3: ");
        int marks3 = scanner.nextInt();
        
        // Calculate the total marks
        int totalMarks = marks1 + marks2 + marks3;
        
        // Display the total marks obtained by the student
        System.out.println("Total marks obtained by the student: " + totalMarks);
        
        // Close the scanner
        scanner.close();
}}
