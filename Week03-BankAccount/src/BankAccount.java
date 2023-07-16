/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 */
public class BankAccount {
     private int accountId;
    private double balance;
    
    //constructor
    public BankAccount(int id, double bal){
        accountId = id;
        balance = bal;
        /*OR Call setters
        setAccountId(id);
        setBalance(bal);
        */
    }
    
    /*overloaded constructor
      constructor with no parameters is also called default constructor
      as JVM makes one if you don't write it yourself in a class.
    */
    public BankAccount(){
        setAccountId(0);
        setBalance(0.0);
    }
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
    //service method deposit
    public void deposit(double money){
        //balance = balance + money;
        //balance += money;
        setBalance(balance + money);
    }
    
    //withdraw money from Bank account
    public void withdraw(double money){
        //balance = balance - money;
              //OR
        //balance -= money;
              //OR
        setBalance(balance - money);
    }
    
    @Override
    public String toString(){
        String output = "";
        output += "Balance in account with ID " + getAccountId()
                + " is $" + String.format("%.2f", getBalance());
        return output;
    }
}
