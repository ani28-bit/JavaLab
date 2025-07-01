 package Polymorphism1;

 public abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected double lastInterestEarned = 0;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract double getInterest();

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount);
            return true;
        } else {
            System.out.println("Insufficient balance.");
            return false;
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getLastInterestEarned() {
        return lastInterestEarned;
    }

    public void transfer(Account to, double amount) {
        if (this instanceof DepositPremiumAccount) {
            System.out.println("Transfer not allowed from Deposit Premium Account.");
            return;
        }
        if (withdraw(amount)) {
            to.deposit(amount);
            System.out.println("Transferred " + amount + " to " + to.getAccountNumber());
        }
    }
}
