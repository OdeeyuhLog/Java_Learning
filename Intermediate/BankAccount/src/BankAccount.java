public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance ) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit (double amount) {
        if (amount > 0) {
            balance+=amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid amount.");
        }

    }

    public void withdraw (double amount) {
        if(amount < 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: $" + balance );
    }

}
