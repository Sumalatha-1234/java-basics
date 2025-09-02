/*Build a class hierarchy:
BankAccount (accountNumber, balance)
SavingsAccount (interestRate)
FixedDepositAccount (maturityPeriod)
Each subclass should call its parent constructor and add extra fields.
Write a program to display all details of an account.
 */
// Base class
class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Subclass for Fixed Deposit
class FixedDepositAccount extends BankAccount {
    private double interestRate;  // annual interest rate in %
    private int timePeriod;       // in years
    private int compoundingFreq;  // number of times interest is compounded per year

    public FixedDepositAccount(String accountNumber, double balance,
                               double interestRate, int timePeriod, int compoundingFreq) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
        this.timePeriod = timePeriod;
        this.compoundingFreq = compoundingFreq;
    }

    // Method to calculate maturity amount
    public double calculateMaturityAmount() {
        return balance * Math.pow(1 + (interestRate / (compoundingFreq * 100.0)),
                compoundingFreq * timePeriod);
    }

    public void displayFDDetails() {
        displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Time Period: " + timePeriod + " years");
        System.out.println("Compounding Frequency: " + compoundingFreq + " times/year");
        double maturityAmount = calculateMaturityAmount();
        System.out.println("Maturity Amount: " + maturityAmount);
        System.out.println("Interest Earned: " + (maturityAmount - balance));
    }
}

// Main class
public class FixedDepositDemo {
    public static void main(String[] args) {
        // Example: FD of ₹50,000 for 3 years at 6% interest compounded yearly
        FixedDepositAccount fd = new FixedDepositAccount("FD12345", 50000, 6.0, 3, 1);
        fd.displayFDDetails();
    }
}
/*
output:
Account Number: FD12345
Balance: 50000.0
Interest Rate: 6.0%
Time Period: 3 years
Compounding Frequency: 1 times/year
Maturity Amount: 59550.8
Interest Earned: 9550.800000000003
 */