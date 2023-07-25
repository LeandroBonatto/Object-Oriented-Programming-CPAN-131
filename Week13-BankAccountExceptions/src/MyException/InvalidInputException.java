/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyException;

/**
 *
 * @author Amrit
 */
public class InvalidInputException extends Exception{
    private double num;
   public InvalidInputException(double num){
         super("Invalid Balance " + num);
         this.num = num;
 } 
}
