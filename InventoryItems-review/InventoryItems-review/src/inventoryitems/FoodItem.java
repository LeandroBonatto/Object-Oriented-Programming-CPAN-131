/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventoryitems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author LEANDRINHO
 */
public class FoodItem extends InventoryItems {
    private double shelfLife;
    private DateTimeFormatter dateFormat;
    
    public FoodItem(String ItemsName, int shelfLife) {
        super(ItemsName);
       //subclass is responsible for initializing its own fields/data
        this.shelfLife = shelfLife;
        this.dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }
    
        public double getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(double shelfLife) {
        this.shelfLife = shelfLife;
    }
    
//expiry date can be returned as a String only after formatting
    public void calcExpiryDate(String calcExpiryDate){
        if(calcExpiryDate <= LocalDate.now())
            this.calcExpiryDate();
    }     
    
    @Override
    public void LocalDate(String localDate) {
        if (date == null) {
        return null;
    }
        return date.plusDays();
    }
         //Step 1: create LocalDate or LocalDateTime reference variable.
         //Step 2: retrieve current date using now() and save it into variable created in step 1
         //Step 3: call plusDays() to add shelfLife to current date variable from step 2 and replace it with updated object
         //return the updated object after formatting it using dateFormat as specified.

//when a subclass overrides superclass method, we might need superclass version of overriden method.
//to call superclass version use super keyword. For example, super.toString()calls InventoryItem's toString() in subclass.
//then subclass can add more to it.
    public String toString(){
        return  super.toString() + "n/ FoodItem name: " + getItemsName() +
                "n/ Shelf Life:  " + this.getShelfLife() +
                "n/ Remove from shelf on: " + String.format("%.2f", this.calcExpiryDate());
    }
    
}
