
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
public class FractionsTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Fraction fraction1 = new Fraction(3,5);
       // Fraction fraction2 = new Fraction(7,2);
       Scanner scan = new Scanner(System.in);
       Fraction fracFirst = new Fraction();
       fracFirst.inputNumerator(scan);
       fracFirst.inputDenominator(scan);
       
        System.out.println(fracFirst);
    }
    
}
