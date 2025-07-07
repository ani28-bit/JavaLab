 package PayRoll_System;

  public class CommissionEmployee extends Employee{
       protected double grossSales,commissionRate;

       public  CommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double  grossSales,double commissionRate) {


           super(firstName, lastName, socialSecurityNumber);
           this.grossSales = grossSales;
           this.commissionRate = commissionRate;


       }

       public double earnings(){
           return grossSales * commissionRate;
       }


       public String toString(){
           return String.format("Commission Employee: %s\nGross Sales: %.2f; Commission Rate: %.2f", super.toString(), grossSales, commissionRate);
       }
}
