/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 */
public class Dog {
    private int size;
    private String breed;
    private String name;
    
    //constructor, note it has no return type, not even void
    //this gets executed by the new on an object initialization statement
    public Dog() {
        size = 5;
        breed = "Spaniel";
        name = "Spot";
    }

    public Dog(String newName, String newBreed, int newSize)
    {
        name = newName;
        breed = newBreed;
        size = newSize;
    }
    //getter or accessor
    public int getSize() { return size; }
    //setter or mutator
    public void setSize(int value) {
        if (value > 1) {
            size = value;
        }
    }

    public String getBreed() { return breed; }
    public void setBreed(String value) { breed = value; }

    public String getName() { return name; }
    public void setName(String value) { name = value; }
    
    public void bark() {
        System.out.println("Ruff!Ruff!");
    }
    public String toString() {
        return "I am a " + breed + ", " + size + " inches tall, and my name is " + name;
    }
}
