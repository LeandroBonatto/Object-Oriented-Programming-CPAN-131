
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
    private String packageName;
    private int usage;
    
    public String getCustomerName() {
       return customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
        
    public String getPackageName() {
        return packageName;
    }
    
    public void setPackageName(String packageName){
        this.packageName = packageName;
    }
    
    public int getUsage() {
        return usage;
    }
    
    public void setUsage(int usage) {
        this.usage = usage;
    }
    
    public double calculateCharges(int usedGB, int allowedGB, double extraCharge, double packPrice){
        usedGB = usage;
        allowedGB += usedGB;
        extraCharge = (allowedGB - 25) * 5;
        packPrice = 24.99 + extraCharge;
        return 0;
    }
    
    public String toString(){
        String output = "";
        output += "Enter the name of customer: " + getCustomerName()
                + "\nEnter your package name: " + getPackageName()
                + "\nPlease enter the usage (in GB): " + getUsage();
        return output;
    }
    
    if(usage >= 25){
        JOptionPane.showMessageDialog(null, firstBill.getCustomerName() + " has purchased the" + firstBill.getPackageName() + " package" + 
        "\nThe usage for this month is: " + firstBill.getUsage() + "GB" + 
        "\nCurrent Bill: $" + packPrice);
        
}


