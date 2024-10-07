package task8;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Account obj = null;
		System.out.println("Enter 1. savings account and 2. current account");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();// This choice is for creating parameterized object
		switch (ch) {
		case 1:
			System.out.println("Enter initial balance and interest rate");
			double savingsBal = sc.nextDouble();
			double interestRate = sc.nextDouble();
			obj = new SavingsAccount(savingsBal, interestRate);
			break;
		case 2:
			System.out.println("Enter initial balance");
			double initialBal = sc.nextDouble();
			obj = new CurrentAccount(initialBal);
			break;
		default:
			System.out.println("Invalid option.");
			System.exit(0);
		}
		while (true) {
			System.out.println("1. Deposit, 2. Withdraw, 3. CalculateInterest, 4. Exit");
			int operation = sc.nextInt();
			switch (operation) {
			case 1:
				System.out.println("Enter amount to deposit");
				double depositAmount = sc.nextDouble();
				obj.deposit(depositAmount);
				break;
			case 2:
				System.out.println("Enter amount to Withdraw");
				double withdrawAmount = sc.nextDouble();
				obj.withdraw(withdrawAmount);
				break;
			case 3:
				obj.calculate_interest();
				break;
			case 4:
				System.out.println("Thank you for using the banking system.");
				System.exit(0);
			default:
				System.out.println("Invalid option.");
			}
		}
	}
}
