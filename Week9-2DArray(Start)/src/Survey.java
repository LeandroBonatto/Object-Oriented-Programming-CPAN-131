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
        ratings = new int[][]{{3,4,5,2,1,4,3,2,4,4},  // 42 total [0]
                              {2,4,3,4,3,3,2,1,2,2},   // 32 total [1]
                              {3,5,4,5,5,3,2,5,5,5},   // 50 total [2] 
                              {1,1,1,3,1,2,1,3,2,4}};  // 28 total [3]
        rows = ratings.length;
        columns = ratings[0].length;
    }
    
    public double[] rowTotal(){
        double[] total = new double [rows];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++ ) {
                total[i] += ratings[i][j];
            }
            System.out.println("Row total #" + (i + 1) + ": " + total[i]);
        }
        return total;
    }
     
    public String toString(){
        String survey = "\n" + columns + " people have tasted " + rows + " flavours of juices and the average for each flavour is: \n";
        double[] sum = rowTotal();
        for(int i = 0; i < sum.length; i++){
            survey += "Flavour #" + (i + 1) + " : " + sum[i] / columns + "\n";
        }
        return survey;
    }   
}
