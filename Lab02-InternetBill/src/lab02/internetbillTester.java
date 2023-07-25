
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*package*/ lab02;

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
       
       firstBill.setCustomeName();
       
       String custName = JOptionPane.showInputDialog("Enter the name of customer: ");
        String customer = String(CustName);
        firstBill.setCustomerName(customer);
        JOptionPane.showMessageDialog(null,firstBill.getCustomerName(),"Customer name update",JOptionPane.INFORMATION_MESSAGE);
        
        
        String packageName = JOptionPane.showInputDialog("Enter your package name: ");
        String package = String(packageName);
        firstBill.setPackageName(package);
        JOptionPane.showMessageDialog(null,firstBill.getPackageName(),"Package name update",JOptionPane.INFORMATION_MESSAGE);
        
        String usage = JOptionPane.showInputDialog("Please enter the usage (in GB): ");
        String usageGB = String(usage);
        firstBill.setUsage(usageGB);
        JOptionPane.showMessageDialog(null,firstBill.getUsage(),"Usage data update",JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println(firstBill.getCustomerName() + "has purchased the" + firstBill.getPackageName() + package + 
        "\nThe usage for this month is: " + firstBill.getUsage() + "GB");
    }
    
}
