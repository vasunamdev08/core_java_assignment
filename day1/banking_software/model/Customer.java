package day1.banking_software.model;

import day1.banking_software.service.BankingOperations;

public class Customer extends Account implements BankingOperations {
    String  name;
    public Customer(String name,String accountNumber) {
        super(accountNumber);
        this.name=name;
    }

    @Override
    public void deposit(double amount) {
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited: $"+balance);
        }else{
            System.err.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.printf("Withdrawn: $"+amount);
        }else{
            System.err.println("Insufficient funds");
        }

    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: $"+balance);
    }

    public String getName() {
        return name;
    }
}
