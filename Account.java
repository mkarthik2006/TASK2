//Account class
public class Account {
    private double balance;

    // No-argument constructor (default)
    public Account() {
        this.balance = 0.0;
    }

    // Constructor with initial balance
    public Account (double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit an amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount. Amount must be positive.");
        }
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Cannot withdraw " + amount);
        } else {
            System.out.println("Invalid withdrawal amount. Amount must be positive.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Main method for testing
    public static void main(String[] args) {
        Account myAccount = new Account(1000.0);
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.displayBalance();
    }
}


