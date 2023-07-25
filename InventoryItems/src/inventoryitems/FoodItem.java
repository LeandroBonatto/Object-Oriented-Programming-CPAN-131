/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventoryitems;

/**
 *
 * @author LEANDRINHO
 */
public class FoodItem extends InventoryItems {
    public double shelfLife;
    
    public FoodItem(String ItemsName) {
        super(ItemsName);
    }
    
        public double getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(double shelfLife) {
        this.shelfLife = shelfLife;
    }
    
    public int expiryDay(){
        return expiryDay = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }
    
    public int calcExpiryDate(){
        return expiryDate < LocalDateTime
        }
    
    
    public String toString(){
        return
    }
    
}
