package bams.pkgabstract;

public class BankAccount {

    private double balance;

    public BankAccount() {
        balance = 0.0;
    }

    public BankAccount(double _balance) {
        balance = _balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }

    public void transfer(double amount, BankAccount other) {
        withdraw(amount);
        other.deposit(amount);
    }
}
