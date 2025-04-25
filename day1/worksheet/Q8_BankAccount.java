package day1.worksheet;
class Bankaccount {
    private String name;
    private double balance;
    private String type;

    // Constructor using 'this' to resolve shadowing
    public Bankaccount(String name, double balance, String type) {
        this.name = name;         // 'this.name' refers to the instance variable
        this.balance = balance;
        this.type = type;
    }

    // Method to deposit money using 'this'
    public void deposit(double balance) {
        System.out.println("Depositing $" + balance + " to " + this.name + "'s account.");
        this.balance += balance;  // 'this.balance' is the instance variable; 'balance' is parameter
    }

    // Display method
    public void displayAccount() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Balance: $" + balance);
    }
}

public class Q8_BankAccount {
    public static void main(String[] args) {
        Bankaccount account = new Bankaccount("Alice", 1000.0, "Savings");

        account.displayAccount();

        account.deposit(500.0); // Add $500 to balance

        System.out.println("\nAfter deposit:");
        account.displayAccount();
    }
}
