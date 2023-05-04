package BankSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Bank {
    private List<Account> accounts;
    private List<Deposit> deposits;
    private List<Loan> loans;
    private List<Transaction> transactions;

    public Bank() {
        accounts = new ArrayList<>();
        deposits = new ArrayList<>();
        loans = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public Account createAccount(String ownerId, double initialBalance) {
        Account account = new Account(ownerId, initialBalance);
        accounts.add(account);
        return account;
    }

    public Deposit createDeposit(Account account, double amount, int duration) {
        Deposit deposit = new Deposit(account, amount, duration);
        deposits.add(deposit);
        return deposit;
    }

    public Loan createLoan(Account account, double amount) {
        Loan loan = new Loan(account, amount);
        loans.add(loan);
        return loan;
    }

    public void performPayment(Account sourceAccount, Account targetAccount, double amount) {
        if (sourceAccount.withdraw(amount)) {
            targetAccount.deposit(amount);
            transactions.add(new Transaction(TransactionType.PAYMENT, new Date(), "Payment", amount));
        }
    }

    // Other methods for managing finances, calculating interest, performing transactions, etc.
}
