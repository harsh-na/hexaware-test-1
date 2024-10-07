package task9;

public class CurrentAccount extends BankAccount {
	private double overDraftLimit;

	public CurrentAccount(String accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: " + amount + " | New balance: " + balance);
	}

	@Override
	public void withdraw(double amount) {
		if (amount > (balance + overDraftLimit)) {
			System.out.println("Overdraft limit exceeded.");
		} else {
			balance -= amount;
			System.out.println("Withdrew: " + amount + " | New balance: " + balance);
		}
	}

	@Override
	public void calculate_interest() {
		System.out.println("No interest for Current Account.");
	}
}
