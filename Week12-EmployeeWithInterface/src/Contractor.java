/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 */
public class Contractor implements PayableWorker{
     private String name;
    private String company;
    private double contractFee;
    private int numWeeks;
    public int getNumWeeks(){
        return numWeeks;
    }
    public void setNumWeeks(int numWeeks){
        this.numWeeks = numWeeks;
    }
    public String getName(){
        return name;
    }
    public String getCompany(){
        return company;
    }
    public void setCompany(String company){
        this.company=company;
    }
    public void setContractFee(double contractFee){
        this.contractFee=contractFee;
    }
    public Contractor(String name,String company, double fee, int weeks){
        this.name=name;
        this.company = company;
        this.contractFee = fee;
        this.numWeeks = weeks;
    }
     @Override
    public double calculateWeeklySalary(){
        return contractFee/numWeeks;
    }
    public String toString(){
        return "Contractor:" + name;
    } 
    
}
