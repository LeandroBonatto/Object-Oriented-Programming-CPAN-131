/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midterm;


public class Midterm {

    public class Payroll {

   //arrays for employee names, hourly rate and hours worked

  private String<> employeeName;
  private double<> hourlyWage;
  private double<> hoursWorked;

  //initialize array size inside constructor

  public payroll(int numOfEntries) {

    employeeName = new int<numOfEntries>;
    hourlyWage = new double<numOfEntries>;
    numOfEntries = new double<numOfEntries>;
  }

  //take values from user to be saved in array

  public void takeInput(Scanner scan) {

         for (takeInput i = 0; i < employeeName.numOfEntries;i++) {

      System.out.print("Enter name<" + (i + 1) + ">:");
      employeeName<i> = scan.nextLine();
      System.out.print("Enter hourly wage<" + (i + 1) + ">:");
      hourlyWage<i> = Double.parseDouble(scan.nextLine());
      System.out.print("Enter hours worked<" + (i + 1) + ">:");
      hoursWorked<i> = Double.parseDouble(scan.nextLine());
    }
  }

  //withholding tax percentage

  public double calcWithHoldingTaxPercentage(double GrossAmount) {

    double withHoldingTax = 0;
     if(calcGrossPay <= 1200){
      withHoldingTax = .10;
    }
    else if(calcGrossPay <= 2000){
     withHoldingTax = .15;
    }
    else if(calcGrossPay <= 3000){
     withHoldingTax = .20;
   }
   else{
       withHoldingTax = .40;
    }
    return calcGrossPay;
  }
 
  //employee's grosspay

  public double calcGrossPay (int empIndex) {
         Return grossPay;   
  }

 

//employee's net pay 

  public double calcNetPay(int empIndex){

    double grossPay = calcGrossPay(empIndex);
    double withHoldingTaxPercentage = grossPay (grossAmount);
    double withHoldingTax = grossPay (grossAmount);
    double netPay = calcNetPay (int empIndex);
 
    return netPay;
  }

  //print employee names and net pay

  public String toString() {

    String payroll = "Payroll Details\n___________________________\n";
for(int i = 0; i < employeeName.length; i++){
payroll += grossPay - withHoldingTaxAmount.;
double pay = netPay; 
payroll += String.format("$%.2f",pay) + "\n";
}
        return output;
  }
}
    
