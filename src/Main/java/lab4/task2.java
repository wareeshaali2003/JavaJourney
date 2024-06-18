package Main.java.lab4;

import java.util.Scanner;

public class task2 {
     public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the age of the first person
        System.out.print("Enter the age of the first person: ");
        int age1 = scanner.nextInt();
        
        // Prompt the user to enter the age of the second person
        System.out.print("Enter the age of the second person: ");
        int age2 = scanner.nextInt();
        
        // Prompt the user to enter the age of the third person
        System.out.print("Enter the age of the third person: ");
        int age3 = scanner.nextInt();
        
        // Determine the oldest age
        int oldestAge = age1;
        if (age2 > oldestAge) {
            oldestAge = age2;
        }
        if (age3 > oldestAge) {
            oldestAge = age3;
        }
        
        // Display the age of the oldest person
        System.out.println("The oldest person is " + oldestAge + " years old.");
        
        // Close the scanner
        scanner.close();
    }
}
