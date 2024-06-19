package Main.java.lab6;

class Employee {
    // Attributes of the Employee class
    private String name;
    private String jobTitle;
    private double salary;

    // Constructor to initialize the attributes
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Method to calculate bonus based on a percentage of the salary
    public double calculateBonus(double percentage) {
        return salary * (percentage / 100);
    }

    // Method to update the salary
    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
            System.out.println("Salary updated to: $" + newSalary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for job title
    public String getJobTitle() {
        return jobTitle;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Employee class
        Employee employee = new Employee("Alice Smith", "Software Engineer", 75000);

        // Display employee details
        employee.displayDetails();

        // Calculate and display a bonus
        double bonus = employee.calculateBonus(10); // 10% bonus
        System.out.println("Bonus: $" + bonus);

        // Update the employee's salary
        employee.updateSalary(80000);

        // Display employee details after salary update
        employee.displayDetails();
    }
}

