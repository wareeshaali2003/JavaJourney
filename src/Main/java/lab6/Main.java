package Main.java.lab6;

class BankAccount {
    // Private attributes of the BankAccount class
    private String accountNumber;
    private double balance;
    private String ownerName;

    // Constructor to initialize the attributes
    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Getter for owner name
    public String getOwnerName() {
        return ownerName;
    }
}

class AccountHolder {
    // Private attributes of the AccountHolder class
    private String username;
    private String password;
    private String email;

    // Constructor to initialize the attributes
    public AccountHolder(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Method to authenticate user
    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    // Method to reset the password
    public void resetPassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            System.out.println("Password reset successful.");
        } else {
            System.out.println("Old password is incorrect.");
        }
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of the BankAccount class
        BankAccount account = new BankAccount("123456789", "John Doe", 500.0);

        // Deposit and withdraw operations
        account.deposit(150.0);
        account.withdraw(100.0);

        // Display account details
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance: $" + account.getBalance());

        // Create an instance of the AccountHolder class
        AccountHolder accountHolder = new AccountHolder("john_doe", "securePassword123", "john.doe@example.com");

        // Authenticate user
        if (accountHolder.authenticate("john_doe", "securePassword123")) {
            System.out.println("Authentication successful.");
        } else {
            System.out.println("Authentication failed.");
        }

        // Reset password
        accountHolder.resetPassword("securePassword123", "newSecurePassword456");

        // Attempt authentication with new password
        if (accountHolder.authenticate("john_doe", "newSecurePassword456")) {
            System.out.println("Authentication successful with new password.");
        } else {
            System.out.println("Authentication failed with new password.");
        }
    }
}
