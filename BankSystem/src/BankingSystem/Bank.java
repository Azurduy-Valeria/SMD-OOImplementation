package BankingSystem;
import java.util.*;

public class Bank {
    private String name;
    private List<Account> accounts;
    private List<Transaction> history;
    private List<TransactionCommand> transactionHistory;


    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
        this.history = new ArrayList<>();
        this.transactionHistory = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void addTransaction(Transaction transaction) {
        this.history.add(transaction);
    }

    public void transferMoney(Account fromAccount, Account toAccount, double amount) {
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
        Transaction transaction = new Transaction("Transfer", new Date(), "Transfer from " + fromAccount.getId() + " to " + toAccount.getId());
        fromAccount.addTransaction(transaction);
        toAccount.addTransaction(transaction);
        this.addTransaction(transaction);
    }

    public void executeTransaction(TransactionCommand transactionCommand) {
        transactionCommand.execute();
        transactionHistory.add(transactionCommand);
    }

   
}
