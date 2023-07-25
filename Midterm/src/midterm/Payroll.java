/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midterm;

import java.util.Scanner;


  public class Payroll {
   //arrays for employee names, hourly rate and hours worked
  private String employeeName;
  private double hourlyWage;
  private double hoursWorked;
 
  //initialize array size inside constructor
   public Payroll(int numOfEntries) {
    employeeName = new String numOfEntries;
    hourlyWage = new double numOfEntries;
    hoursWorked = new double numOfEntries;
  }
 
  //take values from user to be saved in array
  public void takeInput(Scanner scan) {
         for (int i = 0; i < employeeName.length;i++) {
      System.out.print("Enter name<" + (i + 1) + ">:");
      employeeName i = scan.nextLine();
      System.out.print("Enter hourly wage<" + (i + 1) + ">:");
      hourlyWage i = Double.parseDouble(scan.nextLine());
      System.out.print("Enter hours worked<" + (i + 1) + ">:");
      hoursWorked<i> = Double.parseDouble(scan.nextLine());
    }
  }
 
  //withholding tax percentage
  public double calcWithHoldingTaxPercentage(double grossAmount) {
    double withHoldingTax = 0;
     if(grossAmount <= 1200 && grossAmount > 0){
      withHoldingTax = .10;
    }
    else if(grossAmount < 2000 && grossAmount > 1200){
     withHoldingTax = .15;
    }
    else if(grossAmount < 4000 && grossAmount > 2000){
     withHoldingTax = .20;
   }
   else{
       withHoldingTax = .40;
    }
    return withHoldingTax;
  }
 
  //employee's grosspay
  public double calcGrossPay (int empIndex) {
         Return hourlyWage * hoursWorked;   
  }
 
//employee's net pay 
  public double calcNetPay(int empIndex){
    double grossPay = calcGrossPay(empIndex);
    double withHoldingTaxPercentage = calcWithHoldingTaxPercentage(calcGrossPay(empIndex));
    double withHoldingTax = grossPay * withHoldingTaxPercentage;
    double netPay = grossPay – withholdingTax;
    return netPay;
  }
  //print employee names and net pay
  public String toString() {
    String payroll = "Payroll Details\n___________________________\n";
for(int i = 0; i < employeeName.length; i++){
 payroll += employeeName + “ ”;
 double pay = this.calcNetPay(i); 
payroll += String.format("$%.2f",pay) + "\n";
}
        return payroll;
  }
}

    
