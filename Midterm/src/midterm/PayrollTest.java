/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

import java.util.Scanner;

public class PayrollTest {
 
 public PayrollTest() {
//Reference variable
Payroll emp;
    Scanner keyboard = new Scanner(System.in);
System.out.print("How many employees are there? ");
//get number of employees
int length = Integer.parseInt(keyboard.nextLine());
//create new employee object, pass number of employees
emp = newPayroll(length)
//get names, hourly wages and number of hours worked
Emp.takeInput()
System.out.println();
//display each employee's name and net pay
System.out.println(emp.toString());
  }
  public static void main(String<> args) {
    new PayrollTest();
  }   
}

