package assignment1;

import java.util.HashMap;
import java.util.Scanner;

public class Task4J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Double> accounts = new HashMap<>();
		accounts.put(123, 4500.00);
		accounts.put(124, 4563.00);
		accounts.put(125, 7899.00);
		accounts.put(126, 8999.00);
		accounts.put(127, 9333.00);
		accounts.put(128, 7689.00);

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter Youraccount number");
			int accNumber = sc.nextInt();

			if (accounts.containsKey(accNumber)) {
				System.out.println("Your Bank Balance = " + accounts.get(accNumber));
				break;
			} else {
				System.out.println("This account Number is not registered");
			}
		}
		sc.close();
	}

}
