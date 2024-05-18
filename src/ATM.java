import java.util.Scanner;

public class ATM {
    private Account account;

    public ATM() {
        // Initialize the account
        this.account = new Account("Syeda Anabia", "687681146", 1000);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int UserInput;

        do {
            System.out.println("WELLCOME TO AUTOMATED TAILER MACHINE");
            System.out.println("Menu of ATM:");
            System.out.println("1. Check your Balance");
            System.out.println("2.  Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your prefrence: ");
            UserInput = scanner.nextInt();

            switch (UserInput) {
                case 1:
                    System.out.println("Current Balance: Rs" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful.");
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (UserInput != 4);

        scanner.close();
    }
}

