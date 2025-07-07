 package PayRoll_System;

  public abstract class Employee {
     private String firstName,lastName,socialSecurityNumber;

     public Employee(String firstName,String lastName, String socialSecurityNumber){
                      this. firstName = firstName;
                      this. lastName = lastName;
                      this. socialSecurityNumber = socialSecurityNumber;

              }

    public abstract double earnings();

    public String toString(){
        return String.format("%s  %s\nsocialSecurityNumber : %s", firstName,lastName,socialSecurityNumber);
    }
}
