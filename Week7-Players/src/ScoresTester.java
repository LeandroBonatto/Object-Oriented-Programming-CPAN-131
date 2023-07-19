
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
public class ScoresTester {

   public ScoresTester(){
		Scanner scan = new Scanner(System.in);
		System.out.println("How many players in a team?");
		
		PlayersScore score = new PlayersScore(scan.nextInt());
		score.addScores(scan);
		System.out.println(score.toString());
    }
    public static void main(String[] args) {
        new ScoresTester();
    }
}
