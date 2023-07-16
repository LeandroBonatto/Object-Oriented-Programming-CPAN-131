/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class MathInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //single line comments
       /*
       multi line comments
       */
       
        int ivar1 = 7;
        int ivar2 = 3;
        int iresult;
        double var1;
        double var2;
        double result;

        //regular math
        var1 = 25;
        var2 = 3.0;
        result = var1 + var2;
        System.out.println("Addition: " + result);
        result = var1 - var2;
        System.out.println("Subtraction: " + result);
        result = var1 * var2;
        System.out.println("Multiplication: " + result);
        result = var1 / var2;
        System.out.println("Division: " + result);

        //integer math
        iresult = ivar1 / ivar2;
        System.out.println("Integer Division:" + iresult);
        System.out.println(7 / 3);  //integer result
        System.out.println(7.0 / 3);    //to get result with decimals
        iresult = ivar1 % ivar2;
        System.out.println("ivar1 modulo ivar2: " + iresult);

        //shorthand operators
        var1 += 5;
        System.out.println("Shorthand operator add 5 to var1: " + var1);
        var1 -= 5;
        System.out.println("Shorthand operator subtract 5 from var1: " + var1);
        var1 *= 5;
        System.out.println("Shorthand operator multiply 5 with var1: " + var1);

        //increment and decrement operators
        var1++;
        System.out.println("Increment var1 by one: " + var1);
        var1--;
        System.out.println("Decrement var1 by 1: " + var1);

        //constants and literals
        //(5 and 0.12 are the literal below)
        final int NUMBER_OF_TRANSACTIONS = 5;
        
        final float DISCOUNT = 0.12f;

        //casting - cast var1 to int or compiler will complain due
        //to loss of decimal when assigning double to int
        var1 = 3.6;
        ivar1 = (int) var1 / ivar2;

        //the library class Math
        System.out.println("Dividing var1 by var2: " + var1 / var2);
        System.out.println("Double division rounded using Math method: " + Math.round(var1 / var2));
        System.out.println("ivar1 cubed using Math method: " + Math.pow(ivar1, 3));
    }
    
}
