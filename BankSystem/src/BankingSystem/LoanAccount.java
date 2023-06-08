package BankingSystem;

public class LoanAccount implements BankAccount {
    protected double balance;

    public void borrow(double amount) {
        if(amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }

    @Override
    public void deposit(double amount) {
        if(amount <= balance && amount > 0) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Cannot deposit more than loan amount or invalid amount");
        }
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Cannot withdraw from loan account");
    }

    @Override
    public double getBalance() {
        return this.balance;
    }
}
