public class CheckingAccount extends BankAccount {

    private double interestRate;

    // Overdraft fee
    private static final double OVERDRAFT_FEE = 30.00;

    public CheckingAccount(double interestRate) {
        super();
        this.interestRate = interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    //overdraft logic
    @Override
    public void withdrawal(double amount) {
        if (amount > 0) {
            balance -= amount;
            if (balance < 0) {
                balance -= OVERDRAFT_FEE;
                System.out.printf("Withdrew: $%.2f%n", amount);
                System.out.printf("Overdraft! A $%.2f fee has been assessed.%n", OVERDRAFT_FEE);
                System.out.printf("Current Balance: $%.2f%n", balance);
                System.out.printf(" ");
            } else {
                System.out.printf("Withdrew: $%.2f%n", amount);
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void processWithdrawal(double amount) {
        withdrawal(amount);
    }

    //accnt display
    public void displayAccount() {
        System.out.println("Checking Account Summary:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.printf( "Balance: $%.2f%n", balance);
        System.out.printf( "Interest Rate: %.2f%%%n", interestRate);
        System.out.println(" ");
    }
}
