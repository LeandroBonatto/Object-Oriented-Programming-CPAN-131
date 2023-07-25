
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 */
public class FractionTester {
    public FractionTester(){
        
        Fraction[] fractionArray = new Fraction[4];
        fractionArray[0] = new Fraction();
        Fraction numerator1 = null;
        fractionArray[1] = numerator1;
        Fraction numerator2 = null;
        fractionArray[2] = numerator2;
        Fraction denominator1 = null;
        fractionArray[3] = denominator1;
        Fraction denominator2 = null;
        fractionArray[4] = denominator2;
        
        fractionArray[1].inputDenominator(6);
        fractionArray[2].inputDenominator(8);
        fractionArray[3].inputDenominator(4);
        fractionArray[4].inputDenominator(5);
        
        for(int i = 0; i < fractionArray.length; i++){
            fractionArray[i].inputDenominator(6);
        }
        
        for (Fraction frac : fractionArray) {
            System.out.println(frac);
        }
        
    }

    public static void main(String[] args) {
        new FractionTester();       
    }
    
}
