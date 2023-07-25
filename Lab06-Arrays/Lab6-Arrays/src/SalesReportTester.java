
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LEANDRINHO
 */
public class SalesReportTester {
    
    public SalesReportTester(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many sales people are there? ");
        
        SalesReport salesMonth = new SalesReport(scan.nextInt());
		salesMonth.Name(scan);
		System.out.println(salesMonth.toString());
    }
    
    public static void main(String[] args) {
        new SalesReportTester();
    }
    
}
