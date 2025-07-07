 package PayRoll_System;

  public class HourlyEmployee extends Employee {

     private double wage,hours;


     public HourlyEmployee(String firstName,String lastName,String socialSecurityNumber,double  wage,double hours) {
         super(firstName,lastName,socialSecurityNumber);
         this.wage = wage;
         this.hours = hours;
     }

     public double earnings(){
         if(hours<=40){

             return wage * hours;
         }
         else{

              return  40 * wage + (hours-40)* wage * 1.5;
         }
     }

     public String toString(){
         return String.format("Hourly Employee: %s\nHourly wage: %.2f; Hours worked: %.2f", super.toString(),wage,hours);
     }
}
