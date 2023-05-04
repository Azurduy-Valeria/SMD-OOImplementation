package BankSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Account {
    private static int nextId = 1;

    private int id;
    private String ownerId;
    private Date dateOfOpening;
    private double balance;
    private List<Transaction> transactionHistory;

    public Account(String ownerId, double initialBalance) {
        this.id = nextId++;
        this.ownerId = ownerId;
        this.dateOfOpening = new Date();
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public Date getDateOfOpening() {
        return dateOfOpening;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactionHistory.add(new Transaction(TransactionType.WITHDRAWAL, new Date(), "Withdrawal", amount));
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add(new Transaction(TransactionType.DEPOSIT, new Date(), "Deposit", amount));
    }
}
