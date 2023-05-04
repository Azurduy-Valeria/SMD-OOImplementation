package BankSystem;

public class Main {
    public static void main(String[] args) {
        // Create a new bank
        Bank bank = new Bank();
    
        // Create some accounts
        Account aliceAccount = bank.createAccount("Alice", 1000.0);
        Account bobAccount = bank.createAccount("Bob", 500.0);
    
        // Perform a payment from Alice to Bob
        bank.performPayment(aliceAccount, bobAccount, 100.0);
    
        // Print the account balances
        System.out.println("Alice's account balance: " + aliceAccount.getBalance());
        System.out.println("Bob's account balance: " + bobAccount.getBalance());
    }
    
    
}
