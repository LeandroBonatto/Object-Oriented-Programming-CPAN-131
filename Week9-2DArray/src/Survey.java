/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 This program determines and prints the average of each row (juice).
 */
public class Survey {
    private int[][] ratings;
    private int rows;
    private int columns;
    
    public Survey(){
        /*
        The two dimensional array called ratings stores the results of survey held by a manufacturer for tasting four
        new flavours to see how people liked them.
        The manufacturer got 10 people to try each new flavour and give it a score from 1 to 5 (1 == poor and 5 == excellent).
        Each row corresponds to a juice flavour and each column in that row corresponds to the person who tasted it.
        More generally, each row holds the responses that all testers gave for one particular juice flavour
        and each column holds the responses of one person for all juice flavours.
        */
        ratings = new int[][]{{3,4,5,2,1,4,3,2,4,4},
                              {2,4,3,4,3,3,2,1,2,2},
                              {3,5,4,5,5,3,2,5,5,5},
                              {1,1,1,3,1,2,1,3,2,4}};
        rows = ratings.length;
        columns = ratings[0].length;
    }
    
    public double[] average() {
        double[] avg = new double[rows];
        for (int i = 0; i < rows; i++) {
            double sum = 0;
            for (int j = 0; j < columns; j++) {
                sum += ratings[i][j];
            }
            avg[i] = sum / columns;
            System.out.println("Juice flavour sum row #" + (i + 1) + ":" + sum);
        }
        return avg;
    }
    
    public String toString(){
        String survey = "\n" + columns + " people have tasted " + rows + " flavours of juices and the average for each flavour is: \n";
        double sum[] = average();
        for(int i = 0; i < rows; i++){
            survey += "Juice flavour #" + (i + 1) + ": " + sum[i] + "\n";
        }
        return survey;
    }
}
