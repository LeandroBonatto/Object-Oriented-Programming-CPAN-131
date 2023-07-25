/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7.annuals;

public class AnnualFlower {
    private String[][] annualFlowers;
    private int orderFlowers;
    private int myUtilityClass;
    
    public AnnualFlower(){
        
        annualFlowers = new String[][] {};

        orderFlowers = annualFlowers.length;
        myUtilityClass = annualFlowers[0].length;                                
    }

    public String[][] getAnnualFlowers() {
        return annualFlowers;
    }

    public void setAnnualFlowers(String[][] annualFlowers) {
        this.annualFlowers = annualFlowers;
    }

    public int getOrderFlowers() {
        return orderFlowers;
    }

    public void setOrderFlowers(int orderFlowers) {
        this.orderFlowers = orderFlowers;
    }

    public int getMyUtilityClass() {
        return myUtilityClass;
    }

    public void setMyUtilityClass(int myUtilityClass) {
        this.myUtilityClass = myUtilityClass;
    }
    
    public double[] total() {
        double[] tot = new double[orderFlowers];
        for (int i = 0; i < orderFlowers; i++) {
            double sum = 0;
            for (int j = 0; j < myUtilityClass; j++) {
                sum += ratings[i][j];
            }
            tot[i] = sum / myUtilityClass;
        }
        return tot;
    }
    
    
    public String toString() {
         String lab7Annuals = "Marigold" + myUtilityClass + "Pansy" + myUtilityClass + "Zinnias" + myUtilityClass + "Petunia";
        double sum[] = total();
        for(int i = 0; i < orderFlowers; i++){
            lab7Annuals += "";
            lab7Annuals += "Marigold" + (i + 1) + ": " + sum[i] + "\n";
            lab7Annuals += "Pansy" + (i + 1) + ": " + sum[i] + "\n";
            lab7Annuals += "Zinnias" + (i + 1) + ": " + sum[i] + "\n";
            lab7Annuals += "Petunia" + (i + 1) + ": " + sum[i] + "\n";
        }
        return lab7Annuals;
    }
}
