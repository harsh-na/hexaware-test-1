package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task6J {
	public static void main(String args[]) {
		System.out.println("Enter 1. deposits, 2. withdrawls and 3. exit");
		Scanner sc = new Scanner(System.in);
		double balance = 0.0, withdraw_amt = 0.0, deposit_amt = 0.0;
		ArrayList<String> transactions = new ArrayList<>();
		boolean exit = false;
		while (!exit) {
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the amount to deposit");
				deposit_amt = sc.nextDouble();
				balance += deposit_amt;
				transactions.add("Deposit: " + deposit_amt);
				System.out.println("current balance is" + balance);
				break;
			case 2:
				System.out.println("Enter the amount to withdraw");
				withdraw_amt = sc.nextDouble();
				if (withdraw_amt < balance) {
					balance -= withdraw_amt;
					System.out.println("current balance is" + balance);
				} else {
					System.out.println("Insufficient balance");
				}
				transactions.add("withdraw: " + withdraw_amt);
				break;
			case 3:
				exit = true;
				break;

			default:
				System.out.println("Invalid option. Please try again.");
				break;
			}
		}
		System.out.println("\nTransaction History:");
		if (transactions.isEmpty()) {
			System.out.println("No transactions made.");
		} else {
			for (String transaction : transactions) {
				System.out.println(transaction);
			}
		}
		sc.close();

	}
}
