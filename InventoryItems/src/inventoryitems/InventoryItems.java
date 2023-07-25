/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventoryitems;

/**
 *
 * @author LEANDRINHO
 */
public class InventoryItems {
    public String ItemsName;

    
    public InventoryItems(String ItemsName) {
        this.ItemsName = ItemsName;
    }
    
    public String getItemsName() {
        return ItemsName;
    }

    public void setItemsName(String ItemsName) {
        this.ItemsName = ItemsName;
    }
    
    public String toString(){
        String output = "";
        output += "Food Item name: " + this.getItemsName() + 
                "n/ Shelf Life:  " + this.getShelfLife() +
                "n/ Remove from shelf on: " + String.format("%.2f", get.expiryDay());
        return output;
    }
    
}
