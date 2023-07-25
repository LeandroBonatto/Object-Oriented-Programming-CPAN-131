/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 */
public class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private double hoursWorked;

    /**
     * Construct a new part time employee
     * @param name Name of the employee.
     */
    public PartTimeEmployee(String name)
    {
        super(name);
    }
    
    public PartTimeEmployee(String name, double hourlyRate, double hoursWorked)
    {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    /**
     * Set the hourly rate of pay
     * @param rate Dollars per hour.
     */
    public void setHourlyRate(double rate)
    {
        hourlyRate = rate;
    }

    /**
     * increment the number of hours worked.
     * @param hours To be added onto total hours worked.
     */
    public void addToHoursWorked(double hours)
    {
        hoursWorked += hours;
    }

    /**
     * Set the hours worked to zero.
     */
    public void zeroHoursWorked()
    {
        hoursWorked = 0.0;
    }

    /**
     * Calculate the weekly amount to be paid.
     * @return The weekly amount to pay employee.
     */
    public double calculateWeeklySalary()
    {
        return hoursWorked * hourlyRate;
    }
    
    public String toString()
    {
        return super.toString() + " pay rate = " + hourlyRate +
                " hours Worked = " + hoursWorked;
    }
}
