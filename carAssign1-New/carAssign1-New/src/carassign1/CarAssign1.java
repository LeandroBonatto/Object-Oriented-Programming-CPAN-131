/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carassign1;
/**
 *
 * @author LEANDRINHO
 */
public class CarAssign1 {
        private String carMaker;
        private double fuelEfficiency;
        private double fuelCapacity;
        private double fuelFull;
        private double distanceDriven;
    /**
     * @param args the command line arguments
     */
    
    public CarAssign1(String maker,double efficiency,double capacity){
        carMaker = maker;
        fuelEfficiency = efficiency;
        fuelCapacity = capacity;
    }


    public String getCarMaker(){
        return carMaker;
    }

    public void setCarMaker(String carMaker){
        this.carMaker = carMaker;
    }
    
    public double getFuelEfficiency(){
        return fuelEfficiency;
    }
    
    public void setFuelEffiency(double fuelEfficiency){
        this.fuelEfficiency = fuelEfficiency;
    }
    
    public double getFuelCapacity() {
        return fuelCapacity;
    }
    
    public void setFuelCapacity(double fuelCapacity){
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelFull(){
        return fuelFull;
    }
    
    public void setFuelFull(double fuelFull){
        this.fuelFull = fuelFull;
    }

    public void moving(double kilometers){
         //calculate how much gas we need to go the distance
        double gasNeeded = kilometers / fuelEfficiency;
        
        //if there's enough gas, go for it
       if(distanceDriven < gasNeeded){
       }
       //if not enough gas, empty the tank and go as far as you can
       else{
           System.out.println("Not Enough fuel");
       }
    }
    
   public void addGas(double fueltoAdd){
            String Honda;
            String Nissan;
        if(carMaker == Honda && fuelCapacity < 51)

        } else(carMaker == Nissan && fuelCapacity < 76){ 
            
        }
        return addGas;
        
                //set tank to max it can hold, otherwise
		//add litres to amount already there

    
  /*  public double calculate(){

    double fuelFull = 0 + addFuel;
    double fuelcapacity = 0;
    double fuelEfficiency = move * 0.1;
    double fuelInTank = fuelAmount - fuelEffienciency;
    
    if(carMarker == Honda && fullcapacity >= 51)
    System.out.println("Not a valid carMaker or exceeded fuel tank size");
    
    if(carMaker == Nissan && fullcapacity >= 76)
    System.out.println("Not a valid carMaker or exceeded fuel tank size");

    }
    return calculate*/
   
   public String toString(){
       String output=" ";
        output += this.getCarMaker() +" has been driven " + this.distanceDriven +" kilometres \n";
        output += "It has a tank capacity of " + this.getFuelCapacity()  + "litres /n It get";
        output += getFuelEfficiency() + " kilometers to the litre";
        output += "n/It has " + fuelFull + "litres in " + getCarMaker()  +"'s tank right now";
        return output;
   }
}

