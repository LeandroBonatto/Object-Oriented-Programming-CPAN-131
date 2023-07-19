
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
public class ArraysTester {

   public ArraysTester(Scanner scan) {
        /*
         * 1. Declare, fill and print the values in an array
         */

        //Declare an array of 10 integers
        

        //fill the array with the numbers 1 to 10 using a for loop
        

        //print the numbers in an array using for loop
        for (int i = 0; i < iArray.length; i++) {
            System.out.println("iArray[" + i + "]: " + iArray[i]);
        }

        System.out.println("\n");
        /*
         * 2. Declare an array of 5 doubles, take numbers from user and print them at same time
         */
        //Declare an array of 5 doubles
        double[] dArray = new double[5];

        //take the numbers and print at same time using a for loop
        for (int i = 0; i < dArray.length; i++) {
            System.out.println("Enter number " + (i + 1));
            dArray[i] = scan.nextDouble();
            System.out.println("dArray[" + i + "]: " + dArray[i]);
        }
        System.out.println("\n");

        /*
          * 3. Another way of declaring and intializing an array
          * This demo calculates and prints the sum and average of the marks stored in an array 
         */
        //declare and initialize array elements at same time.
        int[] marks = {120, 220, 320, 420};
        int sum = 0;
        //calculate sum
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        //print sum
        System.out.println(sum);
        //calculate and print average
        System.out.println("Average of scores: " + sum / marks.length);

        System.out.println("\n");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new ArraysTester(scanner);
    }
}
