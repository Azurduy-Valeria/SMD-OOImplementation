package BankingSystem;

public abstract class BankAccountDecorator implements BankAccount {
    protected BankAccount decoratedBankAccount;

    public BankAccountDecorator(BankAccount decoratedBankAccount) {
        this.decoratedBankAccount = decoratedBankAccount;
    }

    @Override
    public void deposit(double amount) {
        decoratedBankAccount.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        decoratedBankAccount.withdraw(amount);
    }

    @Override
    public double getBalance() {
        return decoratedBankAccount.getBalance();
    }
}

