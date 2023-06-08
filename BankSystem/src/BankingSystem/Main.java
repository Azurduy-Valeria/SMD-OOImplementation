package BankingSystem;

public class Main {
    public static void main(String[] args) {
  
        Bank sanBank = new Bank("SantanderBank");

        DepositAccount johnsAccount = new DepositAccount("1", "John", 0.0, 0.05);
        sanBank.addAccount(johnsAccount);

        DepositCommand deposit = new DepositCommand(johnsAccount, 500.0);
        sanBank.executeTransaction(deposit);

  
        WithdrawCommand withdraw = new WithdrawCommand(johnsAccount, 200.0);
        sanBank.executeTransaction(withdraw);

        System.out.println("John's balance: " + johnsAccount.getBalance());  

        
    }
}
