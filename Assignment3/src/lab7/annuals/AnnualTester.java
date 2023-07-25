/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7.annuals;

import java.util.Scanner;

/**
 *
 * @author LEANDRINHO
 */
public class AnnualTester {

    public AnnualTester(){
        Scanner scan = new Scanner(System.in);
        Flower[] flowerArray = new Flower[10][4];
        do{
         System.out.println("Enter your order as number of stems of each kind, Type exit to stop");
            name = scan.next();
            if(name.equalsIgnoreCase("exit")) break;
        };
        
        AnnualFlower annualFlower = new AnnualFlower();
        System.out.println(annualFlower);
        
     };
    
    public static void main(String[] args) {
        new AnnualFlower();
    };
}