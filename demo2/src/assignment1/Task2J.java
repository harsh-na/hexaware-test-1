package assignment1;

import java.util.Scanner;

public class Task2J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int withdrawal = 0, deposit = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the  current balance");
		int balance = sc.nextInt();

		System.out.println("Please click 1.Check Balance, 2.Withdraw, 3.Deposit ");
		int ch = sc.nextInt();
		if (ch == 1) {
			System.out.println("Your Balance is " + balance);
		} else if (ch == 2) {
			withdrawal = sc.nextInt();
			if (withdrawal > balance) {
				System.out.println("Not sufficient balance");
			} else {
				if (withdrawal % 100 == 0 || withdrawal % 500 == 0) {
					balance -= withdrawal;
					System.out.println("your remaining balance is " + balance);
				} else {
					System.out.println("Amout should be withdrawn in multiple of 200 or 500");
				}
			}
		} else if (ch == 3) {
			deposit = sc.nextInt();
			balance += deposit;
			System.out.println("Total amount is" + balance);
		}
	}

}
