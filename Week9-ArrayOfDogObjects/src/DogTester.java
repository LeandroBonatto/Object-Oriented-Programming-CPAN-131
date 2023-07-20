
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
public class DogTester {

    public DogTester(){
    //dog is an array of Dog objects
       Scanner scan = new Scanner(System.in);
       Dog[] dogArray = new Dog[100];
       String name, breed;
       int size, index;
       name = "";
       index = 0;
       do{
           System.out.println("Enter name, breed and size of the dog, type stop to stop");
           name = scan.next();
           if(name.equalsIgnoreCase("stop")) break;
           breed = scan.next();
           size = scan.nextInt();
           dogArray[index] = new Dog(name, breed,size);
           index++;
       }while(!name.equalsIgnoreCase("stop"));
       
       for(int i = 0; i < index; i++){
           System.out.println(dogArray[i]);
       }
       /* Dog[] dog = new Dog[4];
        
        dog[0] = new Dog("Fred","German Shephard",6);
        dog[1] = new Dog("Sky","Boxer",8);
        dog[2] = new Dog("Puff","Spaniel",3);
        dog[3] = new Dog();
          dog[1].setName("Marge");
          System.out.println("\nDog object with name change: " + dog[1]);
          System.out.print("Name of last dog in array is: ");
          System.out.println(dog[dog.length-1].toString());
        
        for(Dog doggy : dog){
        System.out.println(doggy);
       }  */

    }
    public static void main(String[] args) {
        new DogTester();
    }
}
