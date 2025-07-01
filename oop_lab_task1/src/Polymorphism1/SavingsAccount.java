package Polymorphism1;

public class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }


    public double getInterest() {
        return 0.025;
    }


    public void deposit(double amount) {
        balance += amount;
        lastInterestEarned = balance * getInterest();
        balance += lastInterestEarned;
        System.out.println("Deposited " + amount + " with interest: " + lastInterestEarned);
    }


    public boolean withdraw(double amount) {
        if ((balance - amount) >= 1000) {
            return super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw. Must maintain minimum balance of 1000.");
            return false;
        }
    }
}
