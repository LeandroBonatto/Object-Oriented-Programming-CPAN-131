
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
public class BankAccountTest {

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
        account1 = new BankAccount(1,10000);
              
        /* Call (invoke) methods to print information about the accounts. 
           This time we call toString()
             */
	System.out.println(account1.toString());				
	
        System.out.println("Input new account id and balance");
        account2 = new BankAccount(scan.nextInt(),scan.nextDouble());
        System.out.println(account2.toString());
        
        //Call deposit and withdraw methods
        account1.withdraw(1000);
        account2.deposit(500);
        
        /*
        Whenever we display an object, toString() is called automatically
        *********interesting*******************
        */
        System.out.println("After transactions");
        System.out.println(account1);
        System.out.println(account2);
    }
    
}
