
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
public class Lottery {
    private int guessNumber;
    private int lotteryNum;

    public int generateLotteryNum(Random random){
        return lotteryNum = random.nextInt(50) + 1;
    }
    
   /* public String pick(int guess){
        String displayString = "";
        if(guess < 1 || guess > 50){
            displayString = "Invalid number, please enter again";
        }else {  //nesting
            guessNumber = guess;
            //Math.abs() - if an argument is positive then no changes are made otherwise -ve argument becomes +ve
            int difference = Math.abs(lotteryNum - guessNumber);
            if (difference == 0) {
                displayString = "Exact match: You win $ 500";
            } else if (difference == 2 || difference == 1) {
                displayString = "Within 2: You win $250";
            } else if (difference == 4 || difference == 3) {
                displayString = "Within 4: You win $100";
            } else {
                displayString = "Sorry, you lose";
            }
        }
        return displayString;
    }*/
    
    //another version of pick method with switch statement
     public String pick(int guess){
        String displayString = "";
        if(guess < 1 || guess > 50){
            displayString = "Invalid number, please enter again";
        }else {
            guessNumber = guess;
            //Math.abs() - if an argument is positive then no changes are made otherwise -ve argument becomes +ve
            int difference = Math.abs(lotteryNum - guessNumber);  
            switch(difference){
                case 0:
                   displayString = "Exact match: You win $ 500";
                   break;
                case 1:
                case 2:
                   displayString = "Within 2: You win $250";
                   break;
                case 3:
                case 4:
                   displayString = "Within 4: You win $100";
                   break;
                default:
                   displayString = "Sorry, you lose"; 
            }
        }
        return displayString; 
    }
}
