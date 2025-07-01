package Polymorphism1;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account current = new CurrentAccount("C120", 5000);
        Account savings = new SavingsAccount("S200", 3000);
        DepositPremiumAccount deposit = new DepositPremiumAccount("D704", 0);

        int choice;

        do {
            System.out.println("\n==== BANK MENU ====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Pay Installment (Deposit Premium)");
            System.out.println("5. Show Balances");
            System.out.println("6. Show Interest Rate & Last Interest");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Current  2. Savings  3. Deposit Premium");
                    int dChoice = sc.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    double dAmount = sc.nextDouble();
                    if (dChoice == 1) current.deposit(dAmount);
                    else if (dChoice == 2) savings.deposit(dAmount);
                    else if (dChoice == 3) deposit.deposit(dAmount);
                    break;

                case 2:
                    System.out.println("1. Current  2. Savings  3. Deposit Premium");
                    int wChoice = sc.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    double wAmount = sc.nextDouble();
                    if (wChoice == 1) current.withdraw(wAmount);
                    else if (wChoice == 2) savings.withdraw(wAmount);
                    else if (wChoice == 3) deposit.withdraw(wAmount);
                    break;

                case 3:
                    System.out.println("Transfer FROM:\n1. Current  2. Savings");
                    int fromChoice = sc.nextInt();
                    System.out.println("Transfer TO:\n1. Current  2. Savings  3. Deposit Premium");
                    int toChoice = sc.nextInt();
                    System.out.print("Enter amount to transfer: ");
                    double tAmount = sc.nextDouble();

                    Account from = (fromChoice == 1) ? current : savings;
                    Account to = (toChoice == 1) ? current : (toChoice == 2) ? savings : deposit;

                    from.transfer(to, tAmount);
                    break;

                case 4:
                    System.out.print("Enter installment amount: ");
                    double inst = sc.nextDouble();
                    deposit.payInstallment(inst);
                    break;

                case 5:
                    System.out.println("Current Account Balance: " + current.getBalance());
                    System.out.println("Savings Account Balance: " + savings.getBalance());
                    System.out.println("Deposit Premium Account Balance: " + deposit.getBalance());
                    break;

                case 6:
                    System.out.println("Interest Info:");
                    System.out.println("Current Account: Interest Rate = " + (current.getInterest() * 100) + "%, Last Interest = " + current.getLastInterestEarned());
                    System.out.println("Savings Account: Interest Rate = " + (savings.getInterest() * 100) + "%, Last Interest = " + savings.getLastInterestEarned());
                    System.out.println("Deposit Premium Account: Interest Rate = " + (deposit.getInterest() * 100) + "%, Last Interest = " + deposit.getLastInterestEarned());
                    break;

                case 0:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
