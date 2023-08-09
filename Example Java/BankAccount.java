package Bank_project;

class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private double balance;

	// Constructor with polymorphism
	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	// Deposit method
	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;

		} else {
			System.out.println("Invalid amount for deposit.");
		}
	}

	// Withdraw method
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;

		} else {
			System.out.println("Insufficient balance or invalid amount for withdrawal.");
		}
	}

	// Getter for account number
	public int getAccountNumber() {
		return accountNumber;
	}
	// Get balance
	public double getBalance() {
		return balance;
	}

	// Perform transaction
	public void transaction(BankAccount receiver, double amount) {
		if (amount > 0 && amount <= balance) {
			this.withdraw(amount);
			receiver.deposit(amount);
			System.out.println("Transferred " + amount + " from Account #" + accountNumber + " to Account #"
					+ receiver.getAccountNumber());
		} else {
			System.out.println("Transaction failed: Insufficient balance or invalid amount.");
		}
	}

	// Display account information
	public void displayAccountInfo() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Available Balance: " + balance);
	}


}

public class Main {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(1, "John Doe", 1000.0);
		BankAccount account2 = new BankAccount(2, "Jane Smith", 500.0);

		// Display initial account information
		System.out.println("Initial Account Information:");
		System.out.println();

		account1.displayAccountInfo();
		account1.deposit(200.0);
		System.out.println("After Deposited: " + account1.getBalance());
		
		System.out.println();

		account2.displayAccountInfo();
		account2.withdraw(100.0);
		System.out.println("After Withdrawn: " + account2.getBalance());
		
		System.out.println();
		
		account1.transaction(account2, 300.0);

		// Display updated account information
		System.out.println("\nUpdated Account Information:");
		System.out.println();
		
		account1.displayAccountInfo();
		account2.displayAccountInfo();

	}

}
