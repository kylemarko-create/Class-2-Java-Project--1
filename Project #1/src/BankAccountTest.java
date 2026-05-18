// Test class
public class BankAccountTest {

    public static void main(String[] args) {

        // Bank Account Test
        System.out.println("Bank Account Test:");

        BankAccount account = new BankAccount();
        account.setFirstName("Jason");
        account.setLastName("Dammy");
        account.setAccountID(1099);

        account.deposit(500);
        account.deposit(250);
        account.withdrawal(100);
        account.accountSummary();

        System.out.println();

        // Normal checking est
        System.out.println("Checking Account test:");

        CheckingAccount checking = new CheckingAccount(1.5);
        checking.setFirstName("John");
        checking.setLastName("Zupper");
        checking.setAccountID(2002);

        checking.deposit(1075);
        checking.processWithdrawal(200.29);
        checking.displayAccount();

        System.out.println();

        // overdraft test
        System.out.println("Overdraft test:");

        CheckingAccount overdraftAccount = new CheckingAccount(2.0);
        overdraftAccount.setFirstName("Ali");
        overdraftAccount.setLastName("Johnson");
        overdraftAccount.setAccountID(3203);

        overdraftAccount.deposit(50);
        overdraftAccount.processWithdrawal(220); // triggers overdraft fee
        overdraftAccount.displayAccount();
    }
}
