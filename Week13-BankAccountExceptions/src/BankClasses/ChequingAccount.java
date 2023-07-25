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
public class ChequingAccount extends BankAccount{
    private int transactionCount;
    
    public ChequingAccount(double balance)throws InvalidInputException{
        super(balance);
        transactionCount = 0;
    }
    
    @Override
    public void deposit(double amount)throws InvalidInputException{
        super.deposit(amount);
        transactionCount++;
    }
    
    @Override
    public void withdraw(double amount)throws InvalidInputException{
        super.withdraw(amount);
        this.transactionCount++;
    }
    
    // Deducts the accumulated fees and resets the transaction count.
    public void deductFees()throws InvalidInputException{
        if(this.transactionCount > MyConstants.FREE_TRANSACTIONS){
            int overTransactions = this.transactionCount - MyConstants.FREE_TRANSACTIONS;
            super.withdraw(MyConstants.TRANSACTION_FEE * overTransactions);
        }
        this.transactionCount = 0;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nNumber of transactions so far: " + this.transactionCount;
    }

    
}
