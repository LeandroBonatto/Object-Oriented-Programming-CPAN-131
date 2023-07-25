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
    
    public void position(int index) throws MyException {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        do {
            try {
                System.out.print("Enter the index:");
                int index = scan.nextInt();
                System.out.println(index);
                flag = false;
    }
    
    public String toString() throws InvalidInputException{
        if (index >= 0) {
            this.index = index;
        } else {
            System.out.println("Index cannot be negative");
        }
            throw new InvalidInputException(index);
        }
        if (index >= 100) {
            this.index = index;
        } else {
            System.out.println("Index" + index + "is invalid");
        }
            throw new InvalidInputException(balance);
        }
    }
    
    public static void main(String[] args) {
        new MyException();
    }   
    
}
