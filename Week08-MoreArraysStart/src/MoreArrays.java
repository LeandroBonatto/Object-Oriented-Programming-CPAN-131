
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
public class MoreArrays {

   public MoreArrays(){
        Scanner scanner = new Scanner(System.in);
         /*
         * 1. declare array that can have 5 double values, fill it via user input, print elements
         */
        double[] dArray = new double[5];
        for (int i = 0; i < dArray.length; i++) {
            System.out.println("Please enter a double");
            dArray[i] = scanner.nextDouble();
        }

        for (int i = 0; i < dArray.length; i++) {
            System.out.println(dArray[i]);
        }

        System.out.println("\nNumbers printed using for each loop");
        //for each loop
        
        
        //print numbers in reverse order - cannot do this with for each loop
        System.out.println("\n1. Array numbers in reverse order");
        for(int i = dArray.length - 1; i >= 0; i--){
            System.out.println(dArray[i]);
        }

        /*
         * 2. Find the largest number in an array and counts the occurences of largest number in array
         */
        int[] iArray = {1, 2, -10, 1, -4, 5, 10, 7, 8, 9, 10, 1, 2};
        int largest = 0;
        //variable taken to count how many times the largest number appears in array
        int count = 0;
        for (int i = 0; i < iArray.length; i++) {
            if (iArray[i] > largest) {
                largest = iArray[i];
            }
        }

        //goes over the array using for loop
        //counts how many times largest number occurs in an array
        for (int i = 0; i < iArray.length; i++) {
            if (iArray[i] == largest) {
                count++;
            }
        }
        //does same using for each loop
//		for (int value : iArray){
//			if (value == largest){
//				count++;
//			}
//		}
        System.out.println("\n\n2. Largest is " + largest + " and it occurs " + count + " times in the array");

        /*
                 * 3. count number of elements that match a predicate (value)
         */
        //declare and initialise array
        int[] values = {1, 2, 3, 4, 1, 2, 5, 7, 9, 10, 1, 4};

        //print array using for each
        System.out.println("\n3. Elements of Array: ");
        for (int value : values) {
            System.out.print(value + "\t");
        }
        //declare counter for the number of times the value we are looking for occurs
        int countValue = 0;
        //get value the user wants to count
        System.out.println("\nEnter value you want to count: ");
        int searchValue = scanner.nextInt();
        for (int value = 0; value < values.length; value++) {
            if (values[value] == searchValue) {
                countValue++;
            }
        }
        System.out.println("\nThe value " + searchValue + " occurs " + countValue
                + " times in the array");

       /*
              * 4. partial fill and read until a sentinel value 0
         */
        //declare an array of 10 integers
        int intArray[] = new int[10];
        int number, counter = 0;
        
        System.out.println("\n4.Enter some numbers, enter '0' to quit");
        do {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            intArray[counter] = number;
            counter++;
        } while (number != 0);
        
        //print partially filled array
        
        
        /*
         * 5. passing an array as a parameter to a method
         */
        //NOTE THAT OBJECTS ARE PASSED BY REFERENCE, NOT PASS BY VALUE
        double[] myArray = new double[4];
        ArrayClass ac = new ArrayClass();
        ac.arrayMethod(myArray);
    }
    public static void main(String[] args) {
        new MoreArrays();
    }
}
