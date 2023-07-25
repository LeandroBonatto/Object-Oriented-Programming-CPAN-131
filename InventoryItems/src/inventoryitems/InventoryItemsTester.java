/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventoryitems;

import java.util.Scanner;

/**
 *
 * @author LEANDRINHO
 */
public class InventoryItemsTester {
     Scanner scan = new Scanner(System.in);
       InventoryItems[] dogArray = new InventoryItems[50];
       String name, type;
       int shippingCost, index;
       name = "";
       index = 0;
       do{
           System.out.println("Enter type, name and shelf life/shipping weight(in pounds)");
           name = scan.next();
           if(name.equalsIgnoreCase("stop")) break;
           type = scan.next();
           shippingCost = scan.nextInt();
           inventoryArray[index] = new InventoryItems(name, type,shippingCost);
           index++;
       }while(!name.equalsIgnoreCase("stop"));
       
       for(int i = 0; i < index; i++){
           System.out.println(InventoryItems[i]);
       }
    
    
    public static void main(String[] args) {
        new InventoryItemsTester();
    }
    
}


