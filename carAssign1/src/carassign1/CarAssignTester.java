/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carassign1;

import javax.swing.JOptionPane;

/**
 *
 * @author LEANDRINHO
 */
public class CarAssignTester {
    
    public static void main(String[] args) {
        CarAssign1 carAssign;
        
        String carMarker = JOptionPane.showInputDialog("Enter Car Maker Honda or Nissan: "); 
        double moving = JOptionPane.showInputDialog("How many kilometers will you move: ");
        double addFuel = JOptionPane.showInputDialog("How many litres would you like to fuel: ")
        System.out.println(getCarMaker() + "has been driven" + String.format("%.2f",moving ()) + "kilometers"
        "n/It has a tank capacity of" + tank()  + "litres"
        "n/It get 10.0 kilometers to the litre"
        "n/It has " + calculate() + "litres in " + getCarMaker()  +"'s tank right now");
    }
            
    
}
    
}
