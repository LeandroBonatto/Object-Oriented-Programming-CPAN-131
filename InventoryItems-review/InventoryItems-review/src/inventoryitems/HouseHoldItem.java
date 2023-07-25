/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventoryitems;

/**
 *
 * @author LEANDRINHO
 */
public class HouseHoldItem extends InventoryItems {
    private double weightInPounds;

    public HouseHoldItem(double weightInPounds, String ItemsName) {
        super(ItemsName);
        this.weightInPounds = weightInPounds;
    }
    //create constructor
    

public double shippingCost(){
        //cost per pound is $5
        return weightInPounds * 5;
    }


public String toString(){
        return super.toString() + "n/ HouseHoldItem name:  " + getItemsName() +
                "n/ Weight in pounds: " + weightInPounds + 
                  "n/ Shipping cost: $" + String.format("%.2f", weightInPounds);
    }
}
