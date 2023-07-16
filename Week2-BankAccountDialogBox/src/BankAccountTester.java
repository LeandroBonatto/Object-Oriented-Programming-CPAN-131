
import java.util.Scanner;
import javax.swing.JOptionPane;

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
	JOptionPane.showMessageDialog(null,account1.getBalance(),"account1 balance ",JOptionPane.INFORMATION_MESSAGE);				
	JOptionPane.showMessageDialog(null,account2.getBalance(),"account2 balance ",JOptionPane.INFORMATION_MESSAGE);

        account2.setAccountId(2);
        account2.setBalance(500);
        
        //Call get method to see the balance in account2
        JOptionPane.showMessageDialog(null,account2.getAccountId(),"account2 ID",JOptionPane.INFORMATION_MESSAGE);				
	JOptionPane.showMessageDialog(null,account2.getBalance(),"account2 balance ",JOptionPane.INFORMATION_MESSAGE);
                
        //change account ID for first account
        account1.setAccountId(1);
        /*
        Read new balance for an account using dialog and update it using set method
        */
        String sBalance = JOptionPane.showInputDialog("Input new balance");
        double bal = Double.parseDouble(sBalance);
        account1.setBalance(bal);
        JOptionPane.showMessageDialog(null,account1.getBalance(),"account1 balance update",JOptionPane.INFORMATION_MESSAGE);				
        
        /*
        Dialog to read new account and update it using set method
        */
        account2.setAccountId(Integer.parseInt(JOptionPane.showInputDialog("Input new account ID")));
        JOptionPane.showMessageDialog(null,account2.getAccountId(),"account2 ID update",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
