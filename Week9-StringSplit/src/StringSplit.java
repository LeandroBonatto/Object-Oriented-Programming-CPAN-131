/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 */
public class StringSplit {

    
    public StringSplit(){
         /*
         * The split method takes a parameter to use as a delimiter
         * and returns a String array containing the strings (tokens) delimited by that parameter
         */
        String sentence = "This is a string object";
        String words[] = sentence.split(" ");
        for(int i = 0; i < words.length; i++){
            System.out.println("words[" + i + "]: " + words[i]);
        }
    }
    public static void main(String[] args) {
       new StringSplit();
    }
}
