package BankingSystem;

import java.util.*;

public class DepositAccount extends Account {
    private double interestRate;

    public DepositAccount(String id, String owner, double initialBalance, double interestRate) {
        super(id, owner, initialBalance);
        this.interestRate = interestRate;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Amount to deposit must be positive");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if(amount <= balance && amount > 0) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient balance or invalid amount");
        }
    }

    // Method to set a new interest rate
    public void setInterestRate(double interestRate) {
        if(interestRate >= 0) {
            this.interestRate = interestRate;
        } else {
            throw new IllegalArgumentException("Interest rate must be non-negative");
        }
    }

    @Override
    public void calculateInterest() {
        // simple interest calculation
        balance += balance * interestRate;
    }

    public double getBalance() {
        return this.balance;
    }

    // Method to get the current interest rate
    public double getInterestRate() {
        return this.interestRate;
    }
}
