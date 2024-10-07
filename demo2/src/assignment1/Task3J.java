//future balance
package assignment1;

import java.util.Scanner;

public class Task3J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 0, rate = 0, years = 0;
		double future_balance = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of customers");
		int n = sc.nextInt();
		while (n-- > 0) {
			System.out.println("Enter the initial balance, annual interest rate, and the number of years");
			balance = sc.nextInt();
			rate = sc.nextInt();
			years = sc.nextInt();
			future_balance = balance * Math.pow(1 + (rate / 100.0), years);
			System.out.println("Your future balance is " + future_balance);
		}
	}

}
