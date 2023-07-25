
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LEANDRINHO
 */
public class internetbillTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       InternetBill firstBill;
       
       firstBill = new InternetBill();
       
       JOptionPane.showMessageDialog(null,firstBill.getCustomerName(),"Customer name",JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showMessageDialog(null,firstBill.getPackageName(),"Package name",JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showMessageDialog(null,firstBill.getUsage(),"Usage in GB",JOptionPane.INFORMATION_MESSAGE);
       
       String custName = JOptionPane.showInputDialog("Enter the name of customer: ");
        firstBill.setCustomerName(custName);
        JOptionPane.showMessageDialog(null,firstBill.getCustomerName(),"Customer name update",JOptionPane.INFORMATION_MESSAGE);
        
        
        String packageName = JOptionPane.showInputDialog("Enter your package name: ");
        firstBill.setPackageName(packageName);
        JOptionPane.showMessageDialog(null,firstBill.getPackageName(),"Package name update",JOptionPane.INFORMATION_MESSAGE);
        
        String usage = JOptionPane.showInputDialog("Please enter the usage (in GB): ");
        int usageGB = Integer.parseInt(usage);
        firstBill.setUsage(usageGB);
        JOptionPane.showMessageDialog(null,firstBill.getUsage(),"Usage data update",JOptionPane.INFORMATION_MESSAGE);
        
        
        JOptionPane.showMessageDialog(null, firstBill.getCustomerName() + " has purchased the" + firstBill.getPackageName() + " package" + 
        "\nThe usage for this month is: " + firstBill.getUsageGB() + "GB"
        "\nCurrent Bill: $" + packPrice);
        
    }
    
}
