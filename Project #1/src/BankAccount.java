public class BankAccount {

    // fields
    protected String firstName;
    protected String lastName;
    protected int accountID;
    protected double balance;

    // inital constructor
    public BankAccount() {
        this.firstName = "Default";
        this.lastName  = "User";
        this.accountID = 0;
        this.balance   = 0.0;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: $" + amount + "   ");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // withdraw
    public void withdrawal(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.printf("Withdrew: $" + amount + "   ");
        } else {
            System.out.println("Withdrawal amount cannot be double negative.");
        }
    }

    // setters and getters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public double getBalance() {
        return balance;
    }

    // summary
    public void accountSummary() {
        System.out.println(" ");
        System.out.println("Account Summary:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.printf( "Balance: $" + balance);
        System.out.println(" ");
    }
}
