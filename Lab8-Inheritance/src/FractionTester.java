
import FractionClasses.Fraction;
import FractionClasses.MixedFraction;
import java.util.Scanner;


public class FractionTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Fraction fraction1 = new Fraction(3,5);
       // Fraction fraction2 = new Fraction(7,2);
       Scanner scan = new Scanner(System.in);
       Fraction fracFirst = new Fraction();
       Fraction fracSecond = new Fraction();
       fracFirst.inputNumerator(scan);
       fracFirst.inputDenominator(scan);
       fracSecond.inputNumerator(scan);
       fracSecond.inputDenominator(scan);
       MixedFraction mixnum1 = new MixedFraction();
       MixedFraction mixnum2 = new MixedFraction();
       
        System.out.println("\nAfter Fraction1 and Fraction2 are added:\n" + fracFirst.add(fracSecond));
        System.out.println("\nAfter Fraction1 and Fraction2 are multiplied:\n" + fracFirst.multiply(fracSecond).toString());
        
    }
    
}
