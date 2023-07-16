import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class InternetBill {
    private final double INTERNET5_PRICE = 24.99;
  private String customerName;
    private String packageName;
    private int usage; 
    
    public InternetBill(String name,String pack, int newUsage){
        customerName = name;
        packageName = pack;
        usage = newUsage;
    }
    
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
    
    public double calculateCharges(){
        double totalCharges = 0;
        int allowed = 25;
        int usedGB = usage - allowed;
        totalCharges = INTERNET5_PRICE;
        if(usedGB > 0){ //check if the difference of used and allowed GB is more than 0
            totalCharges += usedGB * 5;
        }
        return totalCharges;
    }
    
    public String toString(){
        String output = "";
        output += getCustomerName() + " has purchased the " + getPackageName() + " internet package";
        output += "\nThe usage for this month is: " + getUsage() + " GB";
        output += "\nCurrent Bill: $" + String.format("%.2f",calculateCharges());
        return output;
    }
    
//    if(usage >= 25){
//        JOptionPane.showMessageDialog(null, firstBill.getCustomerName() + " has purchased the" + firstBill.getPackageName() + " package" + 
//        "\nThe usage for this month is: " + firstBill.getUsage() + "GB" + 
//        "\nCurrent Bill: $" + packPrice);
//        
        
}


