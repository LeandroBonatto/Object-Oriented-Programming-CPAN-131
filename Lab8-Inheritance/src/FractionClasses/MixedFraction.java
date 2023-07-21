package FractionClasses;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LEANDRINHO
 */
public class MixedFraction extends Fraction{
    private double wholeNum;

    public MixedFraction(double wholeNum) {
        this.wholeNum = wholeNum;
    }

    public MixedFraction(double wholeNum, double numerator, double denominator) {
        super(numerator, denominator);
        this.wholeNum = wholeNum;
    }

    public MixedFraction() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void setWholeNum(int wholeNum) {
        this.wholeNum = wholeNum;
    }
    
    public int getWholeNum(){
        return (int) this.wholeNum;
    }
    
    public String toString(){
        return "The Fraction numerator is: " + getNumerator() +
                 ",\ndenominator is: " + getDenominator() +
                "\nand decimal version of fraction is: " + getDecimal() + 
        
                "\nThe MixedFraction numerator is: " + getNumerator() +
                 ",\ndenominator is: " + getDenominator() +
                "\nand decimal version of fraction is: " + getDecimal() + 
                
                
    }
    
    
}
