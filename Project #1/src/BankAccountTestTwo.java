import java.util.Scanner;

public class BankAccountTestTwo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Which file should we test?");
        System.out.println("BankAccount.class");
        System.out.println("CheckingAccount.class");
        int choice = input.nextInt();
        input.nextLine();

        System.out.print("Enter first name:");
        String firstName = input.nextLine();

        System.out.print("Enter last name:");
        String lastName = input.nextLine();

        System.out.print("ID:");
        int accountID = input.nextInt();

        System.out.print("Enter starting bal: $");
        double startingBalance = input.nextDouble();

        System.out.print("Enter deposit: $");
        double depositAmount = input.nextDouble();

        System.out.print("Enter withdrawal: $");
        double withdrawalAmount = input.nextDouble();

        System.out.println();

        if (choice == 1) {
            BankAccount account = new BankAccount();
            account.setFirstName(firstName);
            account.setLastName(lastName);
            account.setAccountID(accountID);
            account.deposit(startingBalance);
            account.deposit(depositAmount);
            account.withdrawal(withdrawalAmount);
            account.accountSummary();

        } else if (choice == 2) {
            System.out.print("Enter interest:");
            double rate = input.nextDouble();

            CheckingAccount account = new CheckingAccount(rate);
            account.setFirstName(firstName);
            account.setLastName(lastName);
            account.setAccountID(accountID);
            account.deposit(startingBalance);
            account.deposit(depositAmount);
            account.processWithdrawal(withdrawalAmount);
            account.displayAccount();

        } else {
            System.out.println("Invalid choice.");
        }

        input.close();
    }
}
