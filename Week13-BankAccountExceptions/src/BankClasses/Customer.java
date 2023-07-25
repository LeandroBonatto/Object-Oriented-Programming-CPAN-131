/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankClasses;

/**
 *
 * @author Amrit
 */
public class Customer {
     private String name;
     private long phoneNumber;
     private String email;
     /*
    * Aggregation - Customer class contains the BankAccount object
    */
     private BankAccount account;

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }
    
    public void setPhoneNumber(long phn){
        this.phoneNumber = phn;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

    public Customer(String name, long phone, String email,BankAccount account){
        setName(name);
        setPhoneNumber(phone);
        setEmail(email);
        setAccount(account);
    }
    
    public String toString(){
        String output = "";
        output += "Customer Name: " + name + "\nPhone Number: " + this.phoneNumber 
                   + "\nEmail Address: " + email + "\n" + account.toString();
        return output;
    }
}
