
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 */
public class Fraction {
    private double numerator, denominator;
   
   public Fraction()
   {
       numerator = 1;
       denominator = 1;
   }
   
   public Fraction(double newNum, double newDen){
       numerator = newNum;
       denominator = newDen;
   }

    /**
     * @return the numerator
     */
    public double getNumerator() {
        return numerator;
    }

    /**
     * @param numerator the numerator to set
     */
    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    /**
     * @return the denominator
     */
    public double getDenominator() {
        return denominator;
    }

    /**
     * @param denominator the denominator to set
     */
    public void setDenominator(double denominator) {
        if(denominator != 0)
        this.denominator = denominator;
        else{
            System.out.println("Denominator cannot be 0");
        }
    }
    
    public void inputNumerator(Scanner scan){
        System.out.print("Please enter numerator: ");
        setNumerator(scan.nextDouble());
    }
    
    public void inputDenominator(Scanner scan){
      double num = 0;
       do{
            System.out.print("Please enter denominator: ");
            num = scan.nextDouble();
            setDenominator(num);
        }while(num == 0);

    }
    public double getDecimal(){
        return numerator / denominator;
    }
    
    public String toString(){
        return "The fraction's numerator is: " + getNumerator() +
                 ",\ndenominator is: " + getDenominator() +
                "\nand decimal version of fraction is: " + getDecimal();
    }
}
