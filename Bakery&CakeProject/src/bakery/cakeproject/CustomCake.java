/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery.cakeproject;

/**
 *
 * @author LEANDRINHO
 */
public class CustomCake extends Cake {
    private static final int baseCost = 25;
        int layers;
        int size;
        
    public CustomCake(int layers, int size, String flavour) {
        this.layers = layers;
        this.size = size;
        this.flavour = flavour;
        }
    
    @Override
    public double calcCakeCost() {
        double cakeCost = baseCost + 3 * this.layers + this.size;
        return cakeCost;
        }
    
    @Override
        public String toString() {
        String data = "$" + this.calcCakeCost() + " for " + this.flavour + " flavoured cake with " + this.layers
        + " and size is " + this.size + " inches";
            return data;
        }
}
