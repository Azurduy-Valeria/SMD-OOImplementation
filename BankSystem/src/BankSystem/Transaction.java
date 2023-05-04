package BankSystem;

import java.util.Date;

enum TransactionType {
    PAYMENT,
    WITHDRAWAL,
    DEPOSIT,
    INTEREST_CALCULATION,
    INTEREST_RATE_CHANGE,
    DEPOSIT_OPENING,
    DEPOSIT_CLOSING,
    LOAN_OPENING,
    LOAN_PAYMENT,
    DEBIT,
    REPORTING
}

class Transaction {
    private TransactionType type;
    private Date date;
    private String description;
    private double amount;

    public Transaction(TransactionType type, Date date, String description, double amount) {
        this.type = type;
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}

