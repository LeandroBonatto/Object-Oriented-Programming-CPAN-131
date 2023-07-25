
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LEANDRINHO
 */
public class SalesReport {
    private int[] NumSalesPeople;
    private String SalesPerson;
    private int[] Sales;
    

    public SalesReport(int salesPeople, String Person, int QntSales){
        NumSalesPeople = new int[salesPeople];
        SalesPerson = Person;
        Sales = new int[QntSales];
    }
    
    public void Name(Scanner Scan) {
        String newName;
        System.out.println("Enter name" + "["+ SalesPerson +"]:");
    }
    
    public void SalesValue(Scanner Scan){
        int newSalesValue;
        System.out.println("Enter name" + "["+ Sales.length +"]:");
    }
    
    private double totalSales(){
        double total = 0;
        for (int i = 0; i < Sales.length; i++) {
            total += Sales[i];
        }
        return total;
    }
    
    private double percentage(){
        double calcPercentage = 0; {
            int SalesValue = 0;
            int total = 0;
             calcPercentage= ( SalesValue/total ) * 100 ;
        }
        return calcPercentage;
    }
    
    public String toString() {
        String output = "";
        output += "Percentage of Total Sales";
        output += SalesPerson + this.percentage() + "%" + "%.2f";
        output += "\n" + "Total sales were $ " + this.totalSales();
        return output;
    }
    
    
}
