package Operators;

public class SimpleBankTransactions {
    public static void main(String[] args) {
        String accountHolderName = "Anusha"; // Name of the account holder
        double accountBalance = 10000; // Initial balance in the account
        double depositAmount = 2500; // Amount to deposit
        double withdrawalAmount = 1500; // Amount to withdraw
        byte numberOfTransactions = 3; // Number of transactions to perform
        boolean isAccountActive = true; // Account status
        double minimumBalance = 5000; // Minimum balance required
        // Deposit operation
        if(depositAmount > 0 && isAccountActive) {
            accountBalance = accountBalance + depositAmount;
            numberOfTransactions++;
        }
            
        if (withdrawalAmount > 0 && withdrawalAmount <= accountBalance && isAccountActive) {          
        accountBalance = accountBalance - withdrawalAmount;
           numberOfTransactions++;
        } if(accountBalance < minimumBalance){
            System.out.println("Warning: Your account balance is below the minimum required balance.");
        }
         // Print final account details
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Final Account Balance: " + accountBalance);
        System.out.println("Total Transactions: " + numberOfTransactions);
    }
}