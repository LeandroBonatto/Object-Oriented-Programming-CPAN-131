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

    void setCustomeName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

