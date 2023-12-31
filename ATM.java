import java.util.Scanner;

public class ATM {
    private Account account;
    private Scanner scanner;

    public ATM() {
        account = new Account(0); // Starting with an empty account
        scanner = new Scanner(System.in);
    }

    public void start() {
        int choice;

        do {
            System.out.println("\nATM Machine\n");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("\nChoose the operation: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    System.out.println("Balance: " + account.getBalance());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
            }
        } while (choice != 4);
    }

    private void deposit() {
        System.out.print("Enter money to be deposited: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Your money has been successfully deposited.");
    }

    private void withdraw() {
        System.out.print("Enter money to be withdrawn: ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
        System.out.println("Your money has been successfully withdrawn.");
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.start();
    }
}
