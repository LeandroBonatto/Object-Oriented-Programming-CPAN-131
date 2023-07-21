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
        SavingsAccount momsSavings = new SavingsAccount(5000);

      ChequingAccount harrysChequing = new ChequingAccount(100);

      harrysChequing.deposit(100);
      harrysChequing.deposit(100);
      momsSavings.deposit(1000);
      harrysChequing.withdraw(80);
      momsSavings.transfer(harrysChequing, 2000);
      momsSavings.withdraw(1000);
      harrysChequing.transfer(momsSavings, 1000);

      // simulate end of month
      momsSavings.addInterest();
      harrysChequing.deductFees();

      System.out.println("Mom's savings balance = $" + momsSavings.getBalance());
      System.out.println("Harry's chequing balance = $"  + harrysChequing.getBalance());
    }

    public static void main(String[] args) {
        new BankAccountTest();
    }  
}
