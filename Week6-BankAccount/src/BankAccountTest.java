
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

    public BankAccountTest() {
        //Create a reference of Scanner class
        Scanner scan = new Scanner(System.in);
        //Declare a reference variable
        BankAccount account1;
        BankAccount account2;
        
        account1 = new BankAccount(10000);

        System.out.println(account1.toString());

        account2 = new BankAccount(15000);
        System.out.println(account2.toString());

        System.out.println("Before transfer:");
        System.out.println(account1);
        System.out.println(account2);

        // transfer money from account1 to account2
        account1.transfer(account2, 1000);

        // print balances again
        System.out.println("\nAfter transfer:");
        System.out.println(account1);
        System.out.println(account2);
        BankAccount account3 = new BankAccount();
        System.out.println(account3);

        /*
         * An object can be used to call a static method, but you are advised
         * not to do this -- use the class name to call static methods.
         */
        System.out.println("Number of Bank Accounts: " + BankAccount.getHowManyAccounts());

    }
    public static void main(String[] args) {
        new BankAccountTest();
    }
    
}
