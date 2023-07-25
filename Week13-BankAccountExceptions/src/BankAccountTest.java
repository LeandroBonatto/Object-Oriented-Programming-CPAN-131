
import BankClasses.*;
import MyException.InvalidInputException;

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
       
      try{
          SavingsAccount momsSavings = new SavingsAccount(-5000);
         //Rest of the code won't execute as balance is negative and is invalid.
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
      }catch(InvalidInputException ex){
          System.out.println(ex.getMessage());
      }
    }

    public static void main(String[] args) {
        new BankAccountTest();
    }
    
}
