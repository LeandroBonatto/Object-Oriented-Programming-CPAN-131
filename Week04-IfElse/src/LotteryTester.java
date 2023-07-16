
import java.util.Random;
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
public class LotteryTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        Lottery lottery = new Lottery();
        int pick = lottery.generateLotteryNum(random);
        System.out.println(pick);
        System.out.println("Enter your guess");
        String result = lottery.pick(scan.nextInt());
        System.out.println(result);
    }
    
}
