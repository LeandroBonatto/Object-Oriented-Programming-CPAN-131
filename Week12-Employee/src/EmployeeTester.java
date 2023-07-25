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
        FullTimeEmployee fte = new FullTimeEmployee("Bob", 65000);
        employeeList[0] = fte;

        PartTimeEmployee pte = new PartTimeEmployee("Joanne");
        pte.setHourlyRate(25.00);
        pte.addToHoursWorked(37.0);
        employeeList[1] = pte;

        pte = new PartTimeEmployee("John", 20.50, 40);
        employeeList[2] = pte;

        fte = new FullTimeEmployee("Nancy");
        fte.setSalary(77200);
        employeeList[3] = fte;

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
