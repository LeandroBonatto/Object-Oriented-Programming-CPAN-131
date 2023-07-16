
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 */
public class BankAccountTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a reference of Scanner class
        Scanner scan = new Scanner(System.in);
        //Declare a reference variable
        BankAccount account1;
        BankAccount account2;
        /*
         create an object of BankAccount by calling the constructor
         and assign it to reference variable account1
         */
        account1 = new BankAccount();
        account2 = new BankAccount();
        
        /* Call (invoke) methods to print information about the accounts. 
                 Calling a method is also referred to as sending a message to an object
             */
	System.out.println("account1 balance " + account1.getBalance());				
	System.out.println("account2 balance " + account2.getBalance());

        account2.setAccountId(2);
        account2.setBalance(500);
        //Call get method to see the balance in account2
        System.out.println("Account ID of second account: " + account2.getAccountId());
        System.out.println("Balance in second account: " + account2.getBalance());
        
        //change account ID for first account
        account1.setAccountId(1);
        /*
        Read new balance for an account and update it using set method
        */
        System.out.println("Input new balance");
        double bal = scan.nextDouble();
        account1.setBalance(bal);
        System.out.println("account1 balance after change: " + account1.getBalance());
        
        /*
        Read new account and update it using set method
        */
        System.out.println("Input new account ID");
        account2.setAccountId(scan.nextInt());
        System.out.println("account2 ID after change: " + account2.getAccountId());
    }
    
}
