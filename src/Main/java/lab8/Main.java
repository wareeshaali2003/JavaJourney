package Main.java.lab8;
class TablePrinter implements Runnable {
    private int number;
    private String tableName;

    public TablePrinter(int number, String tableName) {
        this.number = number;
        this.tableName = tableName;
    }

    @Override
    public void run() {
        System.out.println("Starting Table: " + tableName);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
            try {
                // Sleep for a random time between 0.1 to 0.5 seconds
                Thread.sleep((long) (Math.random() * 400 + 100));
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
        System.out.println("Completed Table: " + tableName);
    }
}

public class Main {
    public static void main(String[] args) {
        // Table for student roll number
        int rollNumberTable = 2022;
        // Table for date of birth (day)
        int dateOfBirthTable = 5;

        // Create threads for each table
        Thread rollNumberThread = new Thread(new TablePrinter(rollNumberTable, "Roll Number Table"));
        Thread dateOfBirthThread = new Thread(new TablePrinter(dateOfBirthTable, "Date of Birth Table"));

        // Start the threads
        rollNumberThread.start();
        dateOfBirthThread.start();

        // Wait for both threads to finish
        try {
            rollNumberThread.join();
            dateOfBirthThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Both tables have been printed.");
    }
}
