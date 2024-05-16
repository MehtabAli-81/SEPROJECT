public class Account {
    private String accountHolderName;
    private String AccountHolderNumber;
    private double balance;

    public Account(String accountHolderName, String AccountHolderNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.AccountHolderNumber = AccountHolderNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}