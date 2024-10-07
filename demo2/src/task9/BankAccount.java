package task9;

abstract class BankAccount {
	protected String accountNumber;
	protected String customerName;
	protected double balance;

	// Default constructor
	public BankAccount() {
		this.accountNumber = "";
		this.customerName = "";
		this.balance = 0.0;
	}

	// Parameterized constructor
	public BankAccount(String accountNumber, String customerName, double balance) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	}

	// getter and setter function
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);

	public abstract void calculate_interest();

}
