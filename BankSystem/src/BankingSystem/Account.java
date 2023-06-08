package BankingSystem;
import java.util.*;

public abstract class Account {
    protected String id;
    protected String owner;
    protected Date openingDate;
    protected double balance;
    protected List<Transaction> history;
    protected InterestMechanism interestMechanism;

    public Account(String id, String owner, double initialBalance) {
        this.id = id;
        this.owner = owner;
        this.balance = initialBalance;
        this.history = new ArrayList<>();
        this.openingDate = new Date();
        this.interestMechanism = interestMechanism;
    }

    public String getId() {
        return id;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if(amount <= balance && amount > 0) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient balance or invalid amount");
        }
    }

    public void addTransaction(Transaction transaction) {
        history.add(transaction);
    }

    public void calculateInterest() {
        balance += interestMechanism.calculateInterest(balance);
    }

    public void setInterestMechanism(InterestMechanism interestMechanism) {
        this.interestMechanism = interestMechanism;
    }
}

