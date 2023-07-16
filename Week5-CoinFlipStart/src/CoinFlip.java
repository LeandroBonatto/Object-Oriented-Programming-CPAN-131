
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 */
public class CoinFlip {
    private int head;
    private int tail;
    private int numOfFlips;
    
    public CoinFlip(){
        head = tail = numOfFlips = 0;
    }
    
    //heads and tails are to be counted, so can't be intialized
    public CoinFlip(int howManyTimes){
        numOfFlips = howManyTimes;
    }
    
    public void flip(Random random) {
        //syntax for "for loop":      for (    ;     ;    )

       
            
            //can also be done like below using booleans:
            
           
           
           //with while loop
          
    }
    
    public String toString(){
        return "Coin is flipped " + numOfFlips + " times\nHeads: " + head + "\nTails: " + tail;
    }
}
