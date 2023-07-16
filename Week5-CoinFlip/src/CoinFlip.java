
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

        for (int i = 0; i < numOfFlips; i++) {
            int face = random.nextInt(2);  //generates number 0 or 1
            if (face == 0) {  //its a head
                head++;
            } else {     //it's a tail
                tail++;
            }
            
            //can also be done like below using booleans:
            
           /* boolean face = random.nextBoolean(); //generates true or false
            if(face){   //face == true
                head++;
            }else{     //face == false
                tail++;
            }*/
           
           //with while loop
          /*  int flips = 0;
            while(flips < numTimes){
                 face = random.nextBoolean();
            if (face)
                heads++;
            else
                tails++;
            
            flips++;
            } */
        }
    }
    
    public String toString(){
        return "Coin is flipped " + numOfFlips + " times\nHeads: " + head + "\nTails: " + tail;
    }
}
