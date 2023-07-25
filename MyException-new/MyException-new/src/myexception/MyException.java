/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myexception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LEANDRINHO
 */
public class MyException {
    private int index;

    public MyException(int index) {
        this.index = index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    public String toString(){
          return "Index" + index + "is invalid");
    }
    
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          do {
            try {
                System.out.print("Enter the index:");
                int index = scan.nextInt();
                System.out.println(index);
                } catch (InvalidInputException) {
                System.out.println("Index cannot be negative");
                }
   	          //call position method passing index
                  //write two catch blocks to catch two types of exception this method can throw.
                  
        new MyException();
    }      
}
