/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accountvalue;

/**
 *
 * @author LEANDRINHO
 */
public class AccountValue {
    public double amount;
    public void setValue(double totalAmount){
        amount=totalAmount;
    }
    public double getAmount(){
        return amount;
    }
    
    public void calculateAmount(int months,double rate)
    {
        if(amount==0)
        return;
        double interestRate=1.0+(rate/1200.0);
        double currentAmount=0;
        System.out.println("After 0 month the value will be "+String.format("%.3f",amount));

        for(int i=1;i<=months;i++)
        {
            double finalAmount=(currentAmount+amount)*rate;
            currentAmount=finalAmount;
            System.out.println("After " + i + " month the value will be " + String.format("%.3f",finalAmount));
        }
    }
    
}
