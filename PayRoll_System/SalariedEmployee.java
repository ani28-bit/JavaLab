package PayRoll_System;

public class SalariedEmployee extends Employee{
    private  double weeklySalary;


    public SalariedEmployee(String firstName,String lastName,String socialSecurityNumber,double  weeklySalary) {
         super(firstName,lastName,socialSecurityNumber);
         this.weeklySalary = weeklySalary;
    }

    public double earnings(){
        return weeklySalary;
    }

    public String toString(){
         return String.format("SalariedEmployee:  %s\nweeklySalary: %.2f",super.toString(),weeklySalary);
    }
}
