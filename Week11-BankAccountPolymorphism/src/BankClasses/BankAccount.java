/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankClasses;

/**
 *
 * @author Amrit
 */
public class BankAccount {
    private int accountId;
    private double balance;
    //static fields
    private static int previousAcctId;
    private static int howManyAccounts;

    //constructor
    public BankAccount(double bal) {
        accountId = ++previousAcctId;
        balance = bal;
        howManyAccounts++;
        /*OR Call setters
        setAccountId(id);
        setBalance(bal);
         */
    }

    /*overloaded constructor
      constructor with no parameters is also called default constructor
      as JVM makes one if you don't write it yourself in a class.
     */
    public BankAccount() {
        this(MyConstants.MIN_BALANCE);
        howManyAccounts++;
    }

    /* There is a restriction: static methods can't use non-static variables (fields). 
       This is because a static method isn't associated with an object
     */
    public static int getHowManyAccounts() {
        return howManyAccounts;
    }

    public int getAccountId() {
        return accountId;
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
    public void deposit(double money) {
        //balance = balance + money;
        //balance += money;
        setBalance(balance + money);
    }

    //withdraw money from Bank account
    public void withdraw(double money) {
        //balance = balance - money;
        //balance -= money;
        setBalance(balance - money);
    }

    /* public void transfer(BankAccount other, double amount) { 
      balance -= amount; //this.withdraw(amount);
      other.balance += amount; //other.deposit(amount);
   }*/
    public BankAccount transfer(BankAccount other, double amount) {
        this.withdraw(amount);
        other.deposit(amount);
        return this;
        //return other;
    }

    @Override
    public String toString() {
        String output = "";
        output += "Balance in " + this.getClass().getSimpleName() + " with ID " + getAccountId()
                + " is $" + String.format("%.2f", getBalance());
        return output;
    }
}
