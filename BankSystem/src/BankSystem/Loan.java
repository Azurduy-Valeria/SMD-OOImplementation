package BankSystem;

class Loan {
    private static int nextId = 1;

    private int id;
    private Account account;
    private double amount;

    public Loan(Account account, double amount) {
        this.id = nextId++;
        this.account = account;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

}