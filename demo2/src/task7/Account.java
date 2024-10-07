package task7;

public class Account {

	private int accountNumber;
	private String accountType;
	private double accountBalance;

	public Account() {
		this.accountNumber = 0;
		this.accountType = "";
		this.accountBalance = 0.0;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void deposit(float amount) {
		accountBalance += amount;
		System.out.println("amount Deposited");
	}

	public void withdraw(float amount) {
		if (amount <= accountBalance) {
			accountBalance -= amount;
			System.out.println("amount withdrawn");
		} else {
			System.out.println("insufficient Balance");
		}
	}

	public void calculate_interest() {
		double interest_amount = (accountBalance * 4.5) / 100;
		System.out.println("Your interest amount is = " + interest_amount);
	}

}
