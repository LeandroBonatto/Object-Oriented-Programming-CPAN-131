
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 */
public class BankAccountTest {

    public BankAccountTest() {
       BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);
        Customer customer1 = new Customer("Amrit Braich",4162234566L,"amrit.braich@humber.ca",account1);
        Customer customer2 = new Customer("Ron",4162234567L,"ron@gmail.ca",account2);
        System.out.println( customer1.toString() + "\n");
        System.out.println(customer2.toString());
    }

    public static void main(String[] args) {
        new BankAccountTest();
    }
}
