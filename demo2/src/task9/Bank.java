package task9;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj = null;
		System.out.println("Enter 1. SavingsAccount, 2. CurrentAccount");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		sc.nextLine();
		switch (ch) {
		case 1:
			System.out.println("Enter Account Number, Customer Name, Initial Balance, and Interest Rate:");
			String savingsAccNumber = sc.nextLine();
			String savingsCustomerName = sc.nextLine();
			double savingsBalance = sc.nextDouble();
			double interestRate = sc.nextDouble();
			obj = new SavingsAccount(savingsAccNumber, savingsCustomerName, savingsBalance, interestRate);
			break;
		case 2:
			System.out.println("Enter Account Number, Customer Name, and Initial Balance:");
			String currentAccNumber = sc.nextLine();
			String currentCustomerName = sc.nextLine();
			double currentBalance = sc.nextDouble();
			obj = new CurrentAccount(currentAccNumber, currentCustomerName, currentBalance);
			break;
		default:
			System.out.println("Invalid option.");
			System.exit(0);
		}
		while (true) {
			System.out.println("Enetr 1. Deposit, 2. Withdraw, 3. InterestCalculation, 4. Exit");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter the amount to deposit");
				double depositAmount = sc.nextDouble();
				obj.deposit(depositAmount);
				break;
			case 2:
				System.out.println("Enter amount to withdraw");
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
