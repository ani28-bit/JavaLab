package PayRoll_System;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[4];

        employees[0] = new SalariedEmployee("Ali", "Roy", "111-11-1156", 800.00);
        employees[1] = new HourlyEmployee("Boby", "Hasan", "222-89-2229", 16.75, 42);
        employees[2] = new CommissionEmployee("Anita", "Pervin", "303-33-3833", 10000, 0.06);
        employees[3] = new BasePlusCommissionEmployee("Bayezid", "Islam", "489-44-4654", 5000, 0.04, 300);

        for (int i = 0; i < employees.length; i++) {
            Employee emp = employees[i];

            // First, check if base salary needs to be increased
            if (emp instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee bpce = (BasePlusCommissionEmployee) emp;
                bpce.increaseBaseSalaryBy10Percent();
                System.out.println("Base salary is increased by 10%!");
            }


            System.out.println(emp.toString());
            System.out.printf("Weekly earnings: %.2f\n\n", emp.earnings());
        }
    }
}
