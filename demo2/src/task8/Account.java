package task8;

public class Account {
	protected double bal;

	public Account(double bal) {// Parameterized constructor
		this.bal = bal;
	}

//for float
	public void deposit(float amount) {
		bal += amount;
		System.out.println("Deposited: " + amount + " | New balance: " + bal);
	}

	public void withdraw(float amount) {
		if (bal > amount) {
			bal -= amount;
			System.out.println("Withdrew: " + amount + " | New balance: " + bal);
		} else {
			System.out.println("Insufficient balance");
		}
	}

//for integer
	public void deposit(int amount) {
		bal += amount;
		System.out.println("Deposited: " + amount + " | New balance: " + bal);
	}

	public void withdraw(int amount) {
		if (bal > amount) {
			bal -= amount;
			System.out.println("Withdrew: " + amount + " | New balance: " + bal);
		} else {
			System.out.println("Insufficient balance");
		}
	}

//for double
	public void deposit(double amount) {
		bal += amount;
		System.out.println("Deposited: " + amount + " | New balance: " + bal);
	}

	public void withdraw(double amount) {
		if (bal > amount) {
			bal -= amount;
			System.out.println("Withdrew: " + amount + " | New balance: " + bal);
		} else {
			System.out.println("Insufficient balance");
		}
	}

	public void calculate_interest() {
		System.out.println("No interest yet");
	}

}
