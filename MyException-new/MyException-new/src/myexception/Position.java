/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myexception;

/**
 *
 * @author LEANDRINHO
 */
public class Position {
    package myexception;


public class Position {
    //make position method in another class
    public void position(int index) throws MyException {

        if (index > 100) {
            throw MyException(index);
        } else if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        else if (index > 0 && index < 100) {
            System.out.println(index);
        } 
    }
}
}
