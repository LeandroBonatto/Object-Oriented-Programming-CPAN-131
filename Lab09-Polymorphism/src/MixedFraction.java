/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 */
public class MixedFraction extends Fraction{
    private int wholeNumber;
    
    public MixedFraction(){
        super();
    }
    public MixedFraction(int wholeNumber,double numerator, double denominator){
        super(numerator,denominator);
        this.wholeNumber = wholeNumber;
    }
    @Override
    public double getNumerator(){
        return (wholeNumber * this.getDenominator()) + super.getNumerator();
    }
}