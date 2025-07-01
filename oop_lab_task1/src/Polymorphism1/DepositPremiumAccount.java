package Polymorphism1;

public class DepositPremiumAccount extends Account {
    private int installmentsPaid = 0;
    private final int requiredInstallments = 5;

    public DepositPremiumAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }


    public double getInterest() {
        return 0.07;
    }

    public void payInstallment(double amount) {
        balance += amount;
        lastInterestEarned = balance * getInterest();
        balance += lastInterestEarned;
        installmentsPaid++;
        System.out.println("Installment paid: " + amount);
        System.out.println("Interest added: " + lastInterestEarned);
        System.out.println("Installments completed: " + installmentsPaid + "/" + requiredInstallments);
    }


    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit added without interest (use payInstallment() for interest).");
    }


    public boolean withdraw(double amount) {
        if (installmentsPaid < requiredInstallments) {
            System.out.println("Cannot withdraw before completing 5 installments.");
            return false;
        }
        return super.withdraw(amount);
    }


    public void transfer(Account to, double amount) {
        System.out.println("Transfer not allowed from Deposit Premium Account.");
    }
}
