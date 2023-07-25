
import java.util.InputMismatchException;
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
public class ExceptionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        boolean flag = true;
        do {
            try {
                System.out.print("Enter an integer:");
                int number = scan.nextInt();
                System.out.println("The number entered is " + number);
                flag = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again, an integer is required");
                scan.next(); //It will read the pending decimal in the buffer
           }
        } while (flag);
    }
    
}
