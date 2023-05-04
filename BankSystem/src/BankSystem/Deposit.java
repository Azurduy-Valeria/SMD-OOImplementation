package BankSystem;

class Deposit {
    private static int nextId = 1;

    private int id;
    private Account account;
    private double amount;
    private int duration;

    public Deposit(Account account, double amount, int duration) {
        this.id = nextId++;
        this.account = account;
        this.amount = amount;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public Account getAccount() {
        return account;
    }

    public double getAmount() {
        return amount;
    }

    public int getDuration() {
        return duration;
    }
}
