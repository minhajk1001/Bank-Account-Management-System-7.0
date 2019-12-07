package bams.pkgabstract;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(double _interestRate) {
        interestRate = _interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }
}
