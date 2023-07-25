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
    private String ItemsName;

    
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
      //use this.getClass().getName() to retrieve class/object name instead of hard coding FoodItem name or HouseHoldItem name
        output += this.getClass().getSimpleName() + " name: " + this.getItemsName();
        return output;
    }
    
}
