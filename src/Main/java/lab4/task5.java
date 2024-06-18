package Main.java.lab4;

import java.util.Scanner;

public class task5 {
     public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        // Calculate the sum of numbers from 1 to n
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        // Display the result
        System.out.println("The sum of numbers from 1 to " + n + " is " + sum);
        
        // Close the scanner
        scanner.close();
    }
}
