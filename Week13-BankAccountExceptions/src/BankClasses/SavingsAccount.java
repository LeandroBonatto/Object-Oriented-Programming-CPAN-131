/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankClasses;

import MyException.InvalidInputException;

/**
 *
 * @author Amrit
 */
public class SavingsAccount extends BankAccount{
    
    public SavingsAccount(double balance)throws InvalidInputException{
        super(balance);
    }
    public void addInterest()throws InvalidInputException {
        this.deposit(this.getBalance() * MyConstants.INTEREST_RATE);
    }

    //Method overloading
    public void addInterest(double newInterest) throws InvalidInputException{
        this.deposit(this.getBalance() * newInterest);
    }
    
}
