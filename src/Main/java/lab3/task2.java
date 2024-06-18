package Main.java.lab3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();
        
        // Print the multiplication table
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        
        // Close the scanner
        scanner.close();
}
}