
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
       
        System.out.println("Enter the number of times to flip");
        int numOfTimes = scan.nextInt();
        CoinFlip coinFlip = new CoinFlip(numOfTimes);
       // coinFlip.flip(random);
        //System.out.println(coinFlip.toString());
    }
    
}
