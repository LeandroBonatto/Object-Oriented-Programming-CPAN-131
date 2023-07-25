import java.util.ArrayList;
import java.util.Scanner;
import CakeClasses;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery.cakeproject;

/**
 *
 * @author LEANDRINHO
 */
public class OrderCake implements Discount {
    Cake cake;
    public ArrayList<Cake> cakeList = new ArrayList<>();
    
    
    public void getOrder(Scanner sc) {
        System.out.println("Enter the type of cake you want");
        String cakeType = sc.nextLine();
        if (cakeType.equals("Custom")) {
        System.out.println( "Enter the flavour, the number of layers(1 to 4) and size of the cake (6\",8\",10\",12\")");
        String flavour = sc.nextLine();
        int layers = Integer.parseInt(sc.nextLine());
        int size = Integer.parseInt(sc.nextLine());
        CustomCake cc = new CustomCake(layers, size, flavour);
        this.cake = cc;
        } else {
        System.out.println("Enter the flavour and name of the Special cake(Holiday, Weeding, Birthday, Anniversary)");
        String flavour = sc.nextLine();
        String name = sc.nextLine();
        SpecialCake cc = new SpecialCake(name, flavour);
            this.cake = cc;
        }
            this.cakeList.add(this.cake);
        }
    
        public int getEmpIndx() { // used to get the last empty index of cakeList
        if (this.cakeList.isEmpty()) {
            return 0;
        } else {
            return this.cakeList.size();}
        }
        
        @Override
        public double calcDiscount(double price) {
            if (price > 49 && price < 101) {
            return DISCOUNT_A;
            }
            if (price > 100) {
            return DISCOUNT_B;
            } else {
            return 0;
            }
            }
            public double getTotalPrice() {
            double totalAmount = 0;
            for (int i = 0; i < cakeList.size(); i++) {
            double tcc = this.cakeList.get(i).calcCakeCost();
            totalAmount = totalAmount + tcc;
            }
            return totalAmount;
            }
            
    public class CakeOrderCost() {
        double totalAmount = this.getTotalPrice();
        double discount = calcDiscount(totalAmount);
        double finalPrice = totalAmount * (100 - discount) / 100;
        return finalPrice;
        }
        public String toString() {
        String data = "Total amount of the order is $" + this.getTotalPrice() + "\n You are eligible for "
        + this.calcDiscount(this.getTotalPrice()) + "% discount\nYou have to pay $" + this.cakeOrderCost();
        return data;
        }
        }
        Discount.java
        package OrderClasses;
        interface Discount {
        double DISCOUNT_A = 10;
        double DISCOUNT_B = 20;
        public double calcDiscount();
        }
}

