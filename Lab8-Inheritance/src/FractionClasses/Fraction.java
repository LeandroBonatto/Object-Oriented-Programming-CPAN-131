package FractionClasses;


import java.util.Scanner;


public class Fraction {
    double numerator;
    double denominator;
   public Fraction()
   {
       this(1,1);
      // numerator = 1;
      // denominator = 1;
   }
   
   public Fraction(double numerator, double denominator){
       
       this.numerator = numerator;
       this.denominator = denominator;
   }

    public double getNumerator() {
        return numerator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public double getDenominator() {
        return denominator;
    }

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
    
    public Fraction add(Fraction other){
        return new Fraction((this.numerator * other.denominator) + (this.denominator * other.numerator),(this.denominator * other.denominator));
    }
    
    public Fraction multiply(Fraction other){
        return new Fraction((this.numerator * other.numerator),(this.denominator * other.denominator));
    }
   
    public String toString(){
        return "The Fraction numerator is: " + getNumerator() +
                 ",\ndenominator is: " + getDenominator() +
                "\nand decimal version of fraction is: " + getDecimal() + 
        
                "\nThe MixedFraction numerator is: " + getNumerator() +
                 ",\ndenominator is: " + getDenominator() +
                "\nand decimal version of fraction is: " + getDecimal() + 
                
                "\nThe MixedFraction numerator is: " + getNumerator() +
                 ",\ndenominator is: " + getDenominator() +
                "\nand decimal version of fraction is: " + getDecimal();
    }
}
