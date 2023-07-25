
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
    
    private static int howManyResults;
   
   public Fraction()
   {
       numerator = 1;
       denominator = 1;
   }
   
   public Fraction(double newNum, double newDen){
       numerator = newNum;
       denominator = newDen;
       howManyResults++;
   }
   
   public static int getHowManyResults() {
        return howManyResults;
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
    
    public void inputNumerator2(Scanner scan){
        System.out.print("Please enter numerator: ");
        setNumerator(scan.nextDouble());
    }
    
    public void inputDenominator2(Scanner scan){
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
    
    public double addFractions(double result1) {
        double result1 = (numerator * other.denominator + other.denominator);
        return result1;
    }
        
    public double multiplyFractions(double result2){
        double result2 = (numerator * other.numerator, denominator * other.denominator);
        return result2
    }
    
    public String toString(){
        return  "After Fraction1 and Fraction2 are added: " + 
                "\nThe fraction's numerator is: " + getNumerator() +
                 ",\ndenominator is: " + getDenominator() +
                "\nand decimal version of fraction is: " + getDecimal();
                
                "After Fraction1 and Fraction2 are multiplied: " + 
                "\nThe fraction's numerator is: " + getNumerator() +
                 ",\ndenominator is: " + getDenominator() +
                "\nand decimal version of fraction is: " + getDecimal();
                
                
    }
}
