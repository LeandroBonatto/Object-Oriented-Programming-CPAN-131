
import java.util.Arrays;

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
     
        /*
        1. Arithmetics with array elements
         */
        int[] intArray = {2, 4, 6};
        //intArray = intArray + 2;
        // compile time error – can't add int[] + int
        // nor
        int[] array1 = {2, 4, 6};
        int[] array2 = {1, 3, 5};
        // int[] array3 = array1 + array2;
        // compile time error – can't add int[] + int[]
        //We can do math on array elements like this:
        for (int j = 0; j < intArray.length; ++j) {
            intArray[j] = intArray[j] + 2;
        }
        // or

        int[] array3 = new int[array1.length];
        for (int j = 0; j < array1.length; ++j) {
            array3[j] = array1[j] + array2[j]; //parallel arrays
        }
        
        for(int element : array3){
            System.out.println(element);
        }

        /*
        * 2.Copy array 
         */
        int[] sourceArray = {1, 2, 3, 4, 5};
        //targetArray size is same as sourceArray
        // int[] targetArray = new int[sourceArray.length];
        //initialize targetArray with size twice as that of source array
        int[] targetArray = new int[sourceArray.length * 2];
        System.out.println("\nSource Array:");
        for (int value : sourceArray) {
            System.out.print(value + "\t");
        }
        System.out.println();
        //copy values from source array to targetArray
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }
        System.out.println("\nTarget Array:");
        for (int value : targetArray) {
            System.out.print(value + "\t");
        }
        System.out.println("\nComparing Arrays");
        //here source 
        System.out.println(Arrays.equals(sourceArray, targetArray));

        int[] result = new int[targetArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            result[i] = sourceArray[i] + 2;
        }

        System.out.println("\n\nResult Array:");
        for (int value : result) {
            System.out.print(value + "\t");
        }

        //use arraycopy to copy array
        System.arraycopy(sourceArray, 0, targetArray, 5, sourceArray.length);
        //print target array
        System.out.println("\n\nTarget Array:");
        for (int value : targetArray) {
            System.out.print(value + "\t");
        }

        System.out.println();
        System.out.println("Comparing Arrays");
        //
        System.out.println(Arrays.equals(sourceArray, result));
        /*
        * 3.  What will be printed below????
         */
        int[] array = new int[4];
        array[1] = 7;
        array = new int[5];
        System.out.println("array[1]: " + array[1]);

        int[] a = new int[5];
        int[] b = new int[5];
        b[0] = 5;
        a[0] = 6;
        System.out.println(Arrays.equals(a, b));
    }
    public static void main(String[] args) {
        new MoreArrays();
    }
}
