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
       /*All classes which implement the same interface
         can be stored in an array declared as the type of the interface
       */
        PayableWorker workerList[] = new PayableWorker[5];

        FullTimeEmployee fte = new FullTimeEmployee("Bob", 65000);
        workerList[0] = fte;

        PartTimeEmployee pte = new PartTimeEmployee("Joanne");
        pte.setHourlyRate(25.00);
        pte.addToHoursWorked(37.0);
        workerList[1] = pte;

        pte = new PartTimeEmployee("John", 20.50, 40);
        workerList[2] = pte;

        fte = new FullTimeEmployee("Nancy");
        fte.setSalary(77200);
        workerList[3] = fte;
        
        Contractor contractor = new Contractor("Ruby","Infotech", 3000,2);
        workerList[4] = contractor;

        //////////////////////////////////////////////////
        // Print out the employees and their weekly pay //
        //////////////////////////////////////////////////
        for(int i = 0; i < workerList.length; i++)
        {
            System.out.println(workerList[i] + " is paid " +
                    String.format("$%.2f", workerList[i].calculateWeeklySalary()));
        }

    }
    public static void main(String[] args) {
        new EmployeeTester();
    }
}
