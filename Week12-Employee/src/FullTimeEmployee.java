/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *This represents a full-time employee who has a yearly salary.
 * @author Amrit
 */
public class FullTimeEmployee extends Employee{
    private double  salary;

    /**
     * Construct a new full time employee.
     * @param name
     */
    public FullTimeEmployee(String name)
    {
        super(name);
    }
    
    public FullTimeEmployee(String name, double salary){
        super(name);
        this.salary = salary;
    }

    /**
     * Set the yearly salary
     * @param sal Salary in dollars per year.
     */
    public void setSalary(double sal)
    {
        salary = sal;
    }

    /**
     * Calculate the weekly amount to be paid.
     * @return The weekly amount to pay employee.
     */
    public double calculateWeeklySalary()
    {
        return salary / 52.0;
    }
    
    public String toString()
    {
        return super.toString() + " salary = $" + salary;
    }
}
