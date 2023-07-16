
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 */
public class CoinFlipTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create objects
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        //get number of times to flip from user
        int numOfFlips = 0;

        /*
         * while loop
         * The condition is processed at the beginning
         * Use while loop when you do not know the number of times the instructions will be executed
         */
//        while(numOfFlips < 10 || numOfFlips > 100){
//            System.out.println("Enter the number of times (between 10 and 100) to flip ");
//            numOfFlips = scan.nextInt();
//        }

        /*
         * do-while
         * The condition is processed at the end.
         * So the instructions in the loop are processed entirely at least once,
         * regardless of the condition whether it is true or false
         * Using do-while is best for taking user input
         */
        do {
            System.out.println("Enter the number of times (between 10 and 100) to flip ");
            numOfFlips = scan.nextInt();
        } while (numOfFlips < 10 || numOfFlips > 100);
        //get number of times to flip from user and pass the number as an argument to the constructor
       // System.out.println("Enter the number of times to flip");
       // int numOfFlips = scan.nextInt();
        CoinFlip coinFlip = new CoinFlip(numOfFlips);
        coinFlip.flip(random);
        System.out.println(coinFlip.toString());
    }
    
}
