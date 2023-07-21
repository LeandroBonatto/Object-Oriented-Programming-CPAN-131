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
public class SavingsAccount extends BankAccount{
    public SavingsAccount(){
    }
    public SavingsAccount(double balance){
        super(balance);
    }
    public void addInterest() {
        this.deposit(this.getBalance() * MyConstants.INTEREST_RATE);
    }

    //Method overloading
    public void addInterest(double newInterest) {
        this.deposit(this.getBalance() * newInterest);
    }
}
