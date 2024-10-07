package task9;

public class SavingsAccount extends BankAccount {
	private double interestRate;

	public SavingsAccount(String accountNumber, String customerName, double balance, double interestRate) {
		super(accountNumber, customerName, balance);
		this.interestRate = interestRate;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposdited: " + amount + " | New Balance: " + balance);
	}

	@Override
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount + " |new Balance: " + balance);
		} else {
			System.out.println("Insufficient balance");
		}
	}

	@Override
	public void calculate_interest() {
		double interest = balance * interestRate / 100;
		System.out.println("Your Interest Amount" + interest);
	}
}
