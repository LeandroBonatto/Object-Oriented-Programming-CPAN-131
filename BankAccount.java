
public class BankAccount {
    private int accountId;
    private double balance;
    
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int id) {
        accountId = id;
    }

    // getter or accessor method - retrieves the value of a field
    public double getBalance() {
        return balance;
    }

    // setter or mutator method - changes value of a field. 
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
