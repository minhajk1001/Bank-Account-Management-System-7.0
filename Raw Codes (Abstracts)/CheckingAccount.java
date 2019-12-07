package bams.pkgabstract;

public class CheckingAccount extends BankAccount {

    private int transactionCount;

    private static final int freeTrasactiuon = 3;
    private static final double transactionFee = 2.0;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
        transactionCount = 0;
    }

    public void deposit(double amount) {
        transactionCount++;
        super.deposit(amount);
    }

    public void withdraw(double amount) {
        transactionCount++;
        super.withdraw(amount);
    }

    public void deductFees() {
        if (transactionCount > freeTrasactiuon) {
            double fees = transactionFee * (transactionCount - freeTrasactiuon);
            super.withdraw(fees);
        }
        transactionCount = 0;
    }
}
