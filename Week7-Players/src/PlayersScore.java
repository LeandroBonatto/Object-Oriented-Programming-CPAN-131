
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
public class PlayersScore {
     private int numOfPlayers;
    //declare an array for storing players scores
    private int[] playerScore;

    //initialize array size inside constructor
    public PlayersScore(int sizeOfArray) {
        playerScore = new int[sizeOfArray];
    }

    //take values from user to be saved in array
    public void addScores(Scanner scan) {
        int newScore;
        System.out.println("Enter " + playerScore.length + " scores");

        for (int i = 0; i < playerScore.length; i++) {
            do {
                System.out.println("Enter score (between 100 and 200) for player " + (i + 1));
                newScore = scan.nextInt();
            } while (newScore < 100 || newScore > 200);
            playerScore[i] = newScore;
        }
    }
    //calculates sum of values inside array

    public double totalScores() {
        double total = 0;

        for (int i = 0; i < playerScore.length; i++) {
            total += playerScore[i];
        }
        return total;
    }

    public double average() {
        return totalScores() / playerScore.length;
    }

    public int belowAvg() {
        int belowAvgCount = 0;
        for (int i = 0; i < playerScore.length; i++) {

            if (playerScore[i] < average()) {
                belowAvgCount++;
            }
        }
        return belowAvgCount;
    }

    public int aboveAvg() {
        int aboveAvgCount = 0;
        for (int i = 0; i < playerScore.length; i++) {

            if (playerScore[i] > average()) {
                aboveAvgCount++;
            }
        }
        return aboveAvgCount;
    }

    //print array elements, average and number of players above and below average
    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < playerScore.length; i++) {
            output += "Scores[" + i + "]: " + playerScore[i] + "\n";
        }
        output += String.format("Average of players scores: %.2f", this.average());
        output += "\n" + aboveAvg() + " players with score above average";
        output += "\n" + belowAvg() + " players with score below average";
        return output;
    }
}
