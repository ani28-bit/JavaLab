 package PayRoll_System;

   public class BasePlusCommissionEmployee extends CommissionEmployee{
           private double baseSalary;


           public BasePlusCommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double  grossSales,double commissionRate,double baseSalary){
               super(firstName, lastName, socialSecurityNumber,grossSales,commissionRate);
               this.baseSalary = baseSalary;

           }

           public void increaseBaseSalaryBy10Percent() {
           baseSalary *= 1.10;
       }

       @Override
       public double earnings() {
           return baseSalary + super.earnings();
       }

       @Override
       public String toString() {
           return String.format("Base-Salaried Commission Employee: %s\nBase Salary: $%.2f",super.toString(), baseSalary);
       }
}
