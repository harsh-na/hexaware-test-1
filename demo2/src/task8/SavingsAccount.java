package task8;

public class SavingsAccount extends Account {

	private double interestRate;

	public SavingsAccount(double bal, double interestRate) {
		super(bal);
		this.interestRate = interestRate;
	}

	@Override
	public void calculate_interest() {
		double interest = bal * interestRate / 100;
		bal += interest;
		System.out.println("Interest added: " + interest + " | New balance: " + bal);
	}

	@Override
	public void withdraw(float amount) {
		if (amount > bal) {
			System.out.println("Insufficient balance.");
		} else {
			bal -= amount;
			System.out.println("Withdrew: " + amount + " | New balance: " + bal);
		}
	}

	@Override
	public void withdraw(int amount) {
		if (amount > bal) {
			System.out.println("Insufficient balance.");
		} else {
			bal -= amount;
			System.out.println("Withdrew: " + amount + " | New balance: " + bal);
		}
	}

	@Override
	public void withdraw(double amount) {
		if (amount > bal) {
			System.out.println("Insufficient balance.");
		} else {
			bal -= amount;
			System.out.println("Withdrew: " + amount + " | New balance: " + bal);
		}
	}
}