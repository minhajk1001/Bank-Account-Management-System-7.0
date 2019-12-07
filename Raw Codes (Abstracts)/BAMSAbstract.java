package bams.pkgabstract;

public class BAMSAbstract {

    public static void main(String[] args) {
        SavingsAccount mySavings = new SavingsAccount(0.5);
        CheckingAccount withdraw = new CheckingAccount(199);

        mySavings.deposit(10000);
        mySavings.transfer(2000, withdraw);
        withdraw.withdraw(1500);
        withdraw.withdraw(80); 

        mySavings.transfer(1000, withdraw);
        withdraw.withdraw(400);

        mySavings.addInterest();
        withdraw.deductFees();

        System.out.println("My savings balance: " + mySavings.getBalance());
        System.out.println("Checking balance: " + withdraw.getBalance());
    }

}
