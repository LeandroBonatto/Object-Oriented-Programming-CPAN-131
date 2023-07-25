/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery.cakeproject;

/**
 *
 * @author LEANDRINHO
 */
public class SpecialCake extends Cake {
    String nameOfCake;
    double price;
    
    public String[][] cakeArray = new String[][] { 
        { "Holiday Cake", "25" }, 
        { "Birthday Cake", "30" }, 
        { "Wedding Cake", "50" },
        { "Anniversary Cake", "40" } };
    

    public SpecialCake(String nameOfCake, String flavour) {
        this.nameOfCake = nameOfCake;
        this.price = Integer.parseInt(cakeArray[this.getIndx()][1]);
        this.flavour = flavour;
        }
    
    private int getIndx() {
        int i;
        for (i = 0; i < this.cakeArray.length; i++) {
        if (this.nameOfCake.equals(cakeArray[i][0])) {
        break;
        }
    }
        return i;
    }
    
    @Override
    public double calcCakeCost() {
        return this.price;
    }
    
    @Override
    public String toString() {
    String data = "$" + this.calcCakeCost() + " for " + this.flavour + " flavoured " + this.nameOfCake + " cake";
        return data;
    }
