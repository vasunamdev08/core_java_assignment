package day1.banking_software;

import day1.banking_software.model.Customer;

import java.util.Scanner;

public class Main {
    /**
     * Main method to run the banking software.
     * It allows the user to deposit, withdraw, and check balance.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        String accNum = sc.nextLine();

        Customer customer = new Customer(name, accNum);

        int choice;
        do {
            System.out.println("\n=== Banking Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double dep = sc.nextDouble();
                    customer.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double wit = sc.nextDouble();
                    customer.withdraw(wit);
                    break;
                case 3:
                    customer.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our banking system.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}