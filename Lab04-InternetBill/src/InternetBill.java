
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LEANDRINHO
 */
public class InternetBill {
    private String customerName;
    private String sPackageName;
    private char cPackName;
    
    public InternetBill(String name,String sName, char cName){
        customerName = name;
        sPackageName = sName;
        cPackName = cName;
    }
    
    public String getCustomerName() {
       return customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
        
    public String getsPackageName() {
        return sPackageName;
    }
    
    public void setsPackageName(String packageName){
        Scanner scan = new Scanner(System.in);
        if(!packageName.equalsIgnoreCase("A")){
            System.out.println("PACKAGE A (IGNITE_60): ");
            sPackageName = scan.next();
        if(!packageName.equalsIgnoreCase("B"))
            System.out.println("PACKAGE B (IGNITE_30): ");
            sPackageName = scan.next();
        if(!packageName.equalsIgnoreCase("C"))
            System.out.println("PACKAGE C (INTERNET_5): ");
            sPackageName = scan.next();
        if(!packageName.equalsIgnoreCase("D"))
            System.out.println("PACKAGE D (UNLIMITED_USAGE): ");
            sPackageName = scan.next();
        else{
             System.out.println("Invalid letter, please enter again");
             sPackageName = scan.next();
        }
        this.sPackageName = packageName;
    }
    
    public char getcPackName() {
        return cPackName;
    }
    
    public void setcPackName(char packName) {
        this.cPackName = packName;
    }
    
    public void CalculateCharges(int allowedGB, double extraCharge, double packPrice){
        double totalCharges = 0;
        double usage = 0;
        double extraCharge1 = 0;
        double extraCharge2 = 0;
        double extraCharge3 = 0;
        
        if(usedGB1 > 200){ //check if the difference of used and allowed GB is more than 0
            extraCharge1 = usedGB1 * 3.00;
        }
        if(usedGB2 > 125){
            extraCharge2 = usedGB2 * 1.50;
        }
        if(usedGB3 > 25){
            extraCharge = usedGB3 * 5;
        }
        return CalculateCharges;
    }
    
    public String toString(){
        String output = "";
        output += getCustomerName() + " has purchased the " + getsPackageName() + " internet package";
        output += "\nThe usage for this month is: " + getcPackName() + " GB";
        output += "\nCurrent Bill: $" + String.format("%.2f",calculateCharges());
        return output;
    }
                
}


