
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
       this(1,1);
      // numerator = 1;
      // denominator = 1;
   }
   
   public Fraction(double numerator, double denominator){
       
       this.setNumerator(numerator);
       this.setDenominator(denominator);
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
        return this.getNumerator() / this.getDenominator();
    }
    
    public Fraction add(Fraction other){
        return new Fraction((this.getNumerator() * other.getDenominator()) + (this.getDenominator() * other.getNumerator()),
                (this.getDenominator() * other.getDenominator()));
    }
    
    public Fraction multiply(Fraction other){
        return new Fraction((this.getNumerator() * other.getNumerator()),(this.getDenominator() * other.getDenominator()));
    }
   
    public String toString(){
        return "The " + this.getClass().getSimpleName() + " numerator is: " + getNumerator() +
                 ",\ndenominator is: " + getDenominator() +
                "\nand decimal version of fraction is: " + getDecimal() + "\n";
    }
}
