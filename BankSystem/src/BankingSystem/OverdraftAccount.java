package BankingSystem;

public class OverdraftAccount extends BankAccountDecorator {
    private double overdraftLimit;

    public OverdraftAccount(BankAccount decoratedBankAccount, double overdraftLimit) {
        super(decoratedBankAccount);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= getBalance() + overdraftLimit && amount > 0) {
            decoratedBankAccount.withdraw(amount);
        } else {
            throw new IllegalArgumentException("Overdraft limit exceeded or invalid amount");
        }
    }
}


