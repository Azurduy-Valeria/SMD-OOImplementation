package BankingSystem;

public class TieredInterestMechanism implements InterestMechanism {
    @Override
    public double calculateInterest(double balance) {
        if (balance > 100000) {
            return balance * 0.05; // 5% for large balances
        } else if (balance > 10000) {
            return balance * 0.03; // 3% for medium balances
        } else {
            return balance * 0.01; // 1% for small balances
        }
    }
}

