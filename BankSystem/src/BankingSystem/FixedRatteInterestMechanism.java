package BankingSystem;

public class FixedRatteInterestMechanism implements InterestMechanism {
    private double interestRate;

    public FixedRatteInterestMechanism(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest(double balance) {
        return balance * interestRate;
    }
}
