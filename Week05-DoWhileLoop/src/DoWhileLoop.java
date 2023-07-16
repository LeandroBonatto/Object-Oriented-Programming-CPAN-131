
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
public class DoWhileLoop {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        System.out.println("Enter the numbers you want to add or type -1 to exit:");
        do{
           number = scanner.nextInt();
           if(number == -1) break;
           sum = sum + number;
        }while(number != -1);
        
        System.out.print("The sum of numbers is: " + sum);
        
        System.out.println("\nBreak and continue");
        for(int i = 0; i < 10 ; i++){
//            if(i == 5)
//                break;
            if(i <= 5)
            {
                continue;
            }
            System.out.println(i);
        }
        
        //nested for loop
       for(int i = 0; i < 10; i++){   //outer for loop
           if(i > 0)
           System.out.println("");
           for(int j = 0; j < 4;j++){   //nested/inner for loop
               System.out.print(j + "\t");
           }
       }
    }
}
