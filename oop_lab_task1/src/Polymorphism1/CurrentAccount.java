package Polymorphism1;

public class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }


    public double getInterest() {
        return 0.0;
    }


    public void deposit(double amount) {
        balance += amount;
        lastInterestEarned = 0;
        System.out.println("Deposited " + amount + " (No interest)");
    }
}
