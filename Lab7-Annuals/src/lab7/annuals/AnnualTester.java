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
       Lab7Annuals[] flowerArray = new Lab7Annuals[10];
       String name,flower;
       int index;
       name = "";
       index = 0;
       do{
           System.out.println("Enter the name of flower followed by quantity: \n\n");
           name = scan.next();
           if(name.equalsIgnoreCase("stop")) break;
           flower = scan.next();
           Lab7Annuals[index] = new Lab7Annuals(name, flower);
           index++;
       }while(!name.equalsIgnoreCase("stop"));
        Lab7Annuals lab7Annuals = new Lab7Annuals();
        System.out.println(lab7Annuals);
    }
 
    public static void main(String[] args) {
        // TODO code application logic here
        new AnnualTester();
    }
    
}