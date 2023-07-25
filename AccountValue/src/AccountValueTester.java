import accountvalue.AccountValue;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LEANDRINHO
 */
public class AccountValueTester {
    
    
    public static void main(String[] args) 
        {
            AccountValue obj=new AccountValue();
            Scanner scan =new Scanner(System.in);
            System.out.println("Enter the amount, interest rate and number of months");
            double amount=scan.nextDouble();
            obj.setValue(amount);
            double interest=scan.nextDouble();
            int months=scan.nextInt();
            System.out.println("Monthly Saving Amount: " + obj.getAmount());
            obj.calculateAmount(months,interest);
        }
}