/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This is the superclass for all employee classes that declares all of the
 * variables and methods which are common to all of the different types of employees.
 * @author Amrit
 */
public class Employee {
    private static int lastEmployeeNumber = 0;
    private int employeeNumber;
    private String name;

    /**
     * Constructor to create employee and assign a name.
     * @param name Name to assign to employee.
     */
    protected Employee(String name)
    {
        this.name = name;
        setEmployeeNumber();
    }

    /**
     * Set a specific employee number for the employee.
     * @param id The employee number to assign
     */
    public void setEmployeeNumber(int id)
    {
        employeeNumber = id;
    }

    /**
     * Automatically generate and assign an employee number.
     */
    public void setEmployeeNumber()
    {
        lastEmployeeNumber++;
        setEmployeeNumber(lastEmployeeNumber);
    }

    /**
     * Calculate how much to pay every week.
     * @return The week's pay.
     */
    public double calculateWeeklySalary(){
        return 0;
    }
    
    /**
     * Return a string representation of this object.
     * @return The name and employee number as a string.
     */
    public String toString()
    {
        return name + "(" + employeeNumber + ")";
    }  
}
