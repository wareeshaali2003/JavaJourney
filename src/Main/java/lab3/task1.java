package Main.java.lab3;
import java.util.Scanner;
public class task1 {
   public static void main(String[] args) {
            // Create a Scanner object for reading input
            Scanner scanner = new Scanner(System.in);
    
            // Prompt the user to enter the first number
            System.out.print("Enter the first number: ");
            int firstNumber = scanner.nextInt();
    
            // Prompt the user to enter the second number
            System.out.print("Enter the second number: ");
            int secondNumber = scanner.nextInt();
    
            // Calculate the sum of the two numbers
            int sum = firstNumber + secondNumber;
    
            // Print the sum
            System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum);
    
            // Close the scanner
            scanner.close();
        }
    }
      

