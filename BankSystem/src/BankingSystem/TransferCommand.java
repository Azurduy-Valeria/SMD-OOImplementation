package BankingSystem;

public class TransferCommand implements TransactionCommand {
    private Account fromAccount;
    private Account toAccount;
    private double amount;

    public TransferCommand(Account fromAccount, Account toAccount, double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    @Override
    public void execute() {
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }
}
