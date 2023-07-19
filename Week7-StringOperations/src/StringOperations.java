/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 */
public class StringOperations {

    public StringOperations(){
        String s = "Welcome to Java";
        String s1 = new String(" Welcome to Java ");
        System.out.println("Comparing s and s1 with compareTo return :" + s.compareTo(s1));
        System.out.println("Index of W: " + s.indexOf('W'));
        System.out.println("Index of o: " + s.indexOf('o'));
        System.out.println("Last occurence of o: " + s.lastIndexOf('o'));
        System.out.println("Starting index of string \"come\": " + s.indexOf("come"));
        //returns -1 as string "java" does not exist in string s. 
        System.out.println("Index of string \"java\", start searching from index 5: " + s.indexOf("java",5));
        System.out.println("Index of string \"Java\", start searching from index 5 : " +s.indexOf("Java",5));
        //appends HTML to substring picked up from string s
        String message = s.substring(0,11) + "HTML";
        System.out.println(message);
        message = s.substring(5);
        System.out.println(message);
        String s2 = "Bill";
        String s3 = new String("Bill");
        String s4 = "bill";
        String s5 = "Bi";
        String s6 = "ll";
        String s7 = s5 + s6;
        System.out.println(s7);
        
        System.out.println("Comparing s2 and s3 with equals return :" + s2.equals(s3));
        System.out.println("\nComparing s2 and s4 with equalsIgnoreCase return :" + s2.equalsIgnoreCase(s4));
        System.out.println("\nComparing s2 and s4 with equals return :" + s2.equals(s4));
        System.out.println("\nComparing s2 and s3 with == return :" + (s2 ==s3));
        System.out.println("\nComparing s2 and s4 with == return :" + (s2 ==s4));
        System.out.println("\nComparing s2 and s7 with == return :" + (s2 ==s7));
        System.out.println("\nComparing s2 and s7 with equals return :" + s2.equals(s7));
        /* Call length method to find the length of string.Because it is not static, it
           must be prefixed by a reference to an object of class
           string.  Because the return type is int, we assign the
           return values to variable of type int.
        */
        int slength = s.length();
        System.out.println(s + " has length " + slength);
       
        /* Snippet to demonstrate the use of some String methods. 
           Assume we have a string s that contains data */ 

      System.out.println(s + " starts with " + s.charAt(0));
      System.out.println(s + " ends with " + s.charAt(s.length()-1));
      System.out.println("Upper case: " + s.toUpperCase());
      System.out.println("Lower case: " + s.toLowerCase());
      
      /* Quotes added to trimmed string to show where it
         starts and ends */
      System.out.println("Trimmed: \"" + s1.trim() + "\"");
      System.out.println("Trimmed string starts with: "
                          + s1.trim().charAt(0));
      System.out.println("Trimmed string length is: "
                          + s1.trim().length());
      //System.out.println(s2.compareTo(s3));
	}
    public static void main(String[] args) {
        new StringOperations();
    }
    
}
