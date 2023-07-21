import BankClasses.*;
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

    public BankAccountTest(){
    /*SavingsAccount sav = new SavingsAccount(1000);
        SavingsAccount sav2 = new SavingsAccount();
     
        ChequingAccount chq = new ChequingAccount(2000);
        //passing subclass object as last argument - ploymorphism
        Customer customer1 = new Customer("Amrit Braich",4162234566L,"amrit.braich@humber.ca",sav);
        Customer customer2 = new Customer("Ron",4162234567L,"ron@gmail.ca",chq);
        sav.addInterest(.02);
        chq.deposit(100);
        for(int i = 0; i < 3;i++)
            chq.withdraw(100);
        chq.deposit(500);
        
        System.out.println( customer1.toString() + "\n");
        System.out.println(customer2.toString());
        chq.deductFees();
        System.out.println(chq.toString());
        System.out.println(sav2.toString());
      */
        
        BankAccount[] accountArray = new BankAccount[3];  //an array of BankAccount objects
        SavingsAccount momsSavings = new SavingsAccount(5000);

        ChequingAccount harrysChequing = new ChequingAccount(100);
        accountArray[0] = new BankAccount();   //create an object and save it into the array
        accountArray[1] = momsSavings; //polymorphism - assign subclass object to superclass variable
        accountArray[2] = harrysChequing;  //polymorphism

        accountArray[2].deposit(100);
        accountArray[2].deposit(100);
        accountArray[1].deposit(1000);
        accountArray[2].withdraw(80);
        
        for(int i = 0; i < accountArray.length; i++){
            accountArray[i].deposit(1000);
        }

        System.out.println("\n\u001B[34mAccounts before charge fee and add interest\n");
        for (BankAccount acc : accountArray) {
            System.out.println(acc);
        }
        
        for (BankAccount acc : accountArray) {
            if (acc != null) {
                //is the object actually a chequing account?
                //if so, deduct fee
                if (acc instanceof ChequingAccount) {
                    ((ChequingAccount) acc).deductFees();
                    //is the object actually a savings account?
                    //if so, add interest
                } else if (acc instanceof SavingsAccount) {
                    ((SavingsAccount) acc).addInterest();
                }
            }
        }
        System.out.println("\n\u001B[34mAccounts after charge fee and addinterest\n");
        for (BankAccount acc : accountArray) {
            System.out.println(acc);
        }

    }

    public static void main(String[] args) {
        new BankAccountTest();
    }  
}
