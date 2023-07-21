
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
        Fraction fraction = new Fraction(3,5);
        MixedFraction mixedFraction = new MixedFraction(1,2,6);
        MixedFraction mixed = new MixedFraction(2,1,4);
        System.out.println(fraction);
        System.out.println(mixedFraction);
        System.out.println(mixed);
        // \u001B[34m - It is a code to colour code output string blue
        System.out.println("\u001B[34mAdding Mixed Fractions:\n"+ mixedFraction.add(mixed));
        System.out.println("\u001B[34mMultiplying Mixed Fractions: \n" + mixedFraction.multiply(mixed));
    }

    public static void main(String[] args) {
        new FractionTester();       
    }
    
}
