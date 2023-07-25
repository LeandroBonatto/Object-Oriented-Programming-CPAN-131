/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 */
public class EmployeeTester {

    public EmployeeTester(){
        Employee employeeList[] = new Employee[4];

        ////////////////////////////////////////////////////
        // Create some employees and add to employee list //
        ////////////////////////////////////////////////////
       

        //////////////////////////////////////////////////
        // Print out the employees and their weekly pay //
        //////////////////////////////////////////////////
        for(int i = 0; i < employeeList.length; i++)
        {
            System.out.println(employeeList[i] + " is paid " +
                    String.format("$%.2f", employeeList[i].calculateWeeklySalary()));
        }

    }
    public static void main(String[] args) {
        new EmployeeTester();
    }
}
