package test10;

public class Account {
	private long accountNumber;
	private String accountType;
	private double accountBalance;
	private String customer;

	public Account() {
		this.accountNumber = 0L;
		this.accountType = "";
		this.accountBalance = 0.0;
		this.customer = "";
	}

	public Account(long accountNumber, String accountType, double accountBalance, String customer) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		this.customer = customer;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public void printAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Type: " + accountType);
		System.out.println("Account Balance: " + accountBalance);
		System.out.println("Customer: " + customer);
	}
}
