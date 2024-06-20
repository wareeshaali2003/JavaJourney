package Main.java.lab7;

import java.util.Scanner;

class Calculator {
    // Attributes
    private int firstNumber;
    private int secondNumber;
    private int sum;

    // Constructor to initialize the attributes
    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.sum = 0;
    }

    // Method to perform addition
    public void performAddition() {
        sum = firstNumber + secondNumber;
    }

    // Method to swap the sum with the first input value
    public void swapWithFirstNumber() {
        int temp = firstNumber;
        firstNumber = sum;
        sum = temp;
    }

    // Method to display the values
    public void displayValues() {
        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);
        System.out.println("Sum: " + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for two integers
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Create an instance of Calculator
        Calculator calculator = new Calculator(firstNumber, secondNumber);

        // Perform addition
        calculator.performAddition();

        // Display values before swap
        System.out.println("Before Swap:");
        calculator.displayValues();

        // Swap the sum with the first number
        calculator.swapWithFirstNumber();

        // Display values after swap
        System.out.println("After Swap:");
        calculator.displayValues();

        scanner.close();
    }
}

