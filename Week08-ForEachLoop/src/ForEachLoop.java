/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 */
public class ForEachLoop {

    public ForEachLoop(){
       //code to test for each loop
	     String[] flavours = new String[3];
	     flavours[0] = "chocolate";
	     flavours[1] = "strawberry";
	     flavours[2] = "vanilla";
	     //loop using for each loop
	     for (String flavour : flavours)
	        System.out.println(flavour + "\n");
	}
    public static void main(String[] args) {
        new ForEachLoop();
    }    
}
