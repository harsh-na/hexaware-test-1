package task8;

public class CurrentAccount extends Account {
	private double overDraftLimit = 50000;

	public CurrentAccount(double bal) {
		super(bal);
	}

	@Override
	public void calculate_interest() {
		System.out.println("Interest calculation is not applicable for Current Accounts.");
	}

	@Override
	public void withdraw(float amount) {
		if (bal + overDraftLimit >= amount) {
			bal -= amount;
			System.out.println("Withdrawn: " + amount + " | New balance: " + bal);
		} else {
			System.out.println("Insufficient balance");
		}
	}

	@Override
	public void withdraw(int amount) {
		if (bal + overDraftLimit >= amount) {
			bal -= amount;
			System.out.println("Withdrawn: " + amount + " | New balance: " + bal);
		} else {
			System.out.println("Insufficient balance");
		}
	}

	@Override
	public void withdraw(double amount) {
		if (bal + overDraftLimit >= amount) {
			bal -= amount;
			System.out.println("Withdrawn: " + amount + " | New balance: " + bal);
		} else {
			System.out.println("Insufficient balance");
		}
	}

}
