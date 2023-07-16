
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
            
       String custName = JOptionPane.showInputDialog("Enter the name of customer: ");       
        String packageName = JOptionPane.showInputDialog("Enter your package name: ");
        String usage = JOptionPane.showInputDialog("Please enter the usage (in GB): ");
        int usageGB = Integer.parseInt(usage);
        firstBill = new InternetBill(custName,packageName,usageGB);
        JOptionPane.showMessageDialog(null, firstBill.toString());        
    }
    
}
