import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

// Bill Payment System

class BillPayment {
    String payerName;
    double amount;
    String billerName;

    public BillPayment(String payerName, double amount, String billerName) {
        this.payerName = payerName;
        this.amount = amount;
        this.billerName = billerName;
    }

    @Override
    public String toString() {
        return "BillPayment{payerName='" + payerName + "', amount=" + amount + ", billerName='" + billerName + "'}";
    }
}

class BillPaymentSystem {
    private List<BillPayment> billPayments;

    public BillPaymentSystem() {
        this.billPayments = new ArrayList<>();
    }

    public void receiveBillPayment(BillPayment payment) {
        billPayments.add(payment);
        System.out.println("Received bill payment from " + payment.payerName + " to " + payment.billerName + " for amount " + payment.amount);
    }

    public List<BillPayment> getAllBillPayments() {
        return billPayments;
    }
}

// Account Opening System

class Account {
    String accountNumber;
    String accountHolderName;
    double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{accountNumber='" + accountNumber + "', accountHolderName='" + accountHolderName + "', balance=" + balance + "}";
    }
}

class AccountOpeningSystem {
    private Map<String, Account> accounts;

    public AccountOpeningSystem() {
        this.accounts = new HashMap<>();
    }

    public void openNewAccount(Account account) {
        accounts.put(account.accountNumber, account);
        System.out.println("Opened new account for " + account.accountHolderName + " with account number " + account.accountNumber);
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public void printAllAccounts() {
        for (Map.Entry<String, Account> entry : accounts.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}

// Loan Notification System

class LoanTaker {
    String name;
    String loanNumber;

    public LoanTaker(String name, String loanNumber) {
        this.name = name;
        this.loanNumber = loanNumber;
    }

    @Override
    public String toString() {
        return "LoanTaker{name='" + name + "', loanNumber='" + loanNumber + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoanTaker loanTaker = (LoanTaker) o;

        return loanNumber.equals(loanTaker.loanNumber);
    }

    @Override
    public int hashCode() {
        return loanNumber.hashCode();
    }
}

class LoanNotificationSystem {
    private Set<LoanTaker> loanTakers;

    public LoanNotificationSystem() {
        this.loanTakers = new HashSet<>();
    }

    public void addLoanTaker(LoanTaker loanTaker) {
        loanTakers.add(loanTaker);
        System.out.println("Added loan taker " + loanTaker.name + " with loan number " + loanTaker.loanNumber);
    }

    public void notifyLoanTakers() {
        for (LoanTaker loanTaker : loanTakers) {
            System.out.println("Notifying loan taker " + loanTaker.name + " for loan number " + loanTaker.loanNumber + " about limit extension expiry.");
        }
    }
}

// Main Class

public class Main {
    public static void main(String[] args) {
        // Bill Payment System
        BillPaymentSystem billPaymentSystem = new BillPaymentSystem();
        billPaymentSystem.receiveBillPayment(new BillPayment("Alice", 100.0, "Electricity"));
        billPaymentSystem.receiveBillPayment(new BillPayment("Bob", 200.0, "Water"));

        System.out.println("\nAll Bill Payments:");
        for (BillPayment payment : billPaymentSystem.getAllBillPayments()) {
            System.out.println(payment);
        }

        // Account Opening System
        AccountOpeningSystem accountOpeningSystem = new AccountOpeningSystem();
        accountOpeningSystem.openNewAccount(new Account("ACC123", "Alice", 1000.0));
        accountOpeningSystem.openNewAccount(new Account("ACC124", "Bob", 2000.0));

        System.out.println("\nAll Accounts:");
        accountOpeningSystem.printAllAccounts();

        // Loan Notification System
        LoanNotificationSystem loanNotificationSystem = new LoanNotificationSystem();
        loanNotificationSystem.addLoanTaker(new LoanTaker("Alice", "LOAN123"));
        loanNotificationSystem.addLoanTaker(new LoanTaker("Bob", "LOAN124"));

        System.out.println("\nLoan Takers to be Notified:");
        loanNotificationSystem.notifyLoanTakers();
    }
}
