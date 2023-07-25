/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bakery.cakeproject;

import java.util.Scanner;

/**
 *
 * @author LEANDRINHO
 */
public class BakeryCakeProject {
    
    public static void main(String[] args) throws Exception  {
       Scanner sc = new Scanner(System.in);
            System.out.println("**Bakery & Cakes Shop**");
            
            System.out.println("How many cakes would you like to order?");
            
            int numOfCakes = Integer.parseInt(sc.nextLine());
                System.out.println("Which one do you prefer, Special or Custom Cake");
            OrderCake oc = new OrderCake();
            for (int i = 0; i < numOfCakes; i++) {
            oc.getOrder(sc);
            }
            for (int i = 0; i < numOfCakes; i++) {
                System.out.println(oc.cakeList.get(i));
            }
                System.out.println(oc);
            }
}
