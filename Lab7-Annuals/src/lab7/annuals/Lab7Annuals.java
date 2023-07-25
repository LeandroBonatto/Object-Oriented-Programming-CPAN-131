/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7.annuals;

/**
 *
 * @author LEANDRINHO
 */
public class Lab7Annuals {
    private String[][] annualFlowers;
    private int orderFlowers;
    private int myUtilityClass;
    
    public Lab7Annuals(){
        
        annualFlowers = new String[][]  {{"Marigold","2.30"},
                                        {"Pansy","1.50"},
                                        {"Zinnias","5.12"},
                                        {"Petunia","3.25"}};

        orderFlowers = annualFlowers.length;
        myUtilityClass = annualFlowers[0].length;                                
    }
    
    public double searchPrice (String myUtilityClass,int orderFlowers) {
	double totalCost = 0.0;
        if(myUtilityClass.equalsIgnoreCase("Marigold")) {
		totalCost = orderFlowers*2.30;
	} 
	else if(myUtilityClass.equalsIgnoreCase("Pansy")) {
		totalCost = orderFlowers*1.50;
	}
	else if(myUtilityClass.equalsIgnoreCase("Zinnias")) {
		totalCost = orderFlowers*5.12;
	}
        else if(myUtilityClass.equalsIgnoreCase("Petunia")) {
		totalCost = orderFlowers*3.25;
	}
	else {
		System.out.println("That flower is not available.");
	}
	return totalCost;
    }

    public int getOrderFlowers() {
        return orderFlowers;
    }

    public void setOrderFlowers(int orderFlowers) {
        this.orderFlowers = orderFlowers;
    }
    
    
    public String toString() {
        String totalCost = null;
        String lab7Annuals = "**Price per Stem**\n Marigold 2.30\n Pansy 1.50\n Zinnias 5.12\n Petunia 3.25" + 
                                "\n***************Bill***************";
        String survey = getOrderFlowers() + "costs" + totalCost + " for " + getOrderFlowers() + " stems";
        
        return lab7Annuals;
    }
    
}
