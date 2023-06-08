package BankingSystem;

public class BasicAccount implements BankAccount {
    protected double balance;

    @Override
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= balance && amount > 0) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient balance or invalid amount");
        }
    }

    @Override
    public double getBalance() {
        return this.balance;
    }
}

