package task7;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter accountNumber");
		int accountNumber = sc.nextInt();
		acc.setAccountNumber(accountNumber);

		System.out.println("Enter the Account type");
		String accountType = sc.next();
		acc.setAccountType(accountType);

		System.out.println("Enter account balance");
		double accountBalance = sc.nextDouble();
		acc.setAccountBalance(accountBalance);

		boolean exit = false;

		while (!exit) {
			System.out.println("\nBank Operations Menu:");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Calculate Interest");
			System.out.println("4. Display Account Balance");
			System.out.println("5. Exit");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the amount to deposit");
				float deposited_amount = sc.nextInt();
				acc.deposit(deposited_amount);
				break;
			case 2:
				System.out.println("Enter the amount to withdraw");
				float amount = sc.nextInt();
				acc.withdraw(amount);
				break;
			case 3:
				if (acc.getAccountType().equalsIgnoreCase("savings")) {
					acc.calculate_interest();
				}
				break;
			case 4:
				System.out.println("current account Balance = " + acc.getAccountBalance());
				break;
			case 5:
				exit = true;
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice! Please select a valid option.");
				break;
			}
		}
		sc.close();
	}
}
