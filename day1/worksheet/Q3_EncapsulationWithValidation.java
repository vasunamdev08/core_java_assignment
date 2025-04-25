package day1.worksheet;
class BankAccount {
    private String accountHolder;
    private double balance;
    private String accountNumber;

    // Constructor
    public BankAccount(String accountHolder, double balance, String accountNumber) {
        this.accountHolder = accountHolder;
        setBalance(balance); // use setter to apply validation
        this.accountNumber = accountNumber;
    }

    // Getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter for accountHolder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance with validation
    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Method to display account details
    public void printDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

public class Q3_EncapsulationWithValidation {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice Smith", 1500.0, "ABC12345");
        account1.printDetails();

        // Try setting a negative balance
        account1.setBalance(-500);
        System.out.println("Updated Balance: $" + account1.getBalance());
    }
}
