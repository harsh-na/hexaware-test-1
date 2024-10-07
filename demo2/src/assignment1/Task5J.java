package assignment1;

import java.util.Scanner;

public class Task5J {
	public static boolean validPassword(String password) {
		if (password.length() < 8) {
			return false;
		}
		boolean hasUpperCase = false;
		boolean hasDigit = false;

		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			if (Character.isUpperCase(ch)) {
				hasUpperCase = true;
			}
			if (Character.isDigit(ch)) {
				hasDigit = true;
			}
		}
		if (!hasUpperCase) {
			System.out.println("Password must contain at least one uppercase letter.");
			return false;
		}

		if (!hasDigit) {
			System.out.println("Password must contain at least one digit.");
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String password = sc.nextLine();
		if (validPassword(password)) {
			System.out.println("Valid Password");
		} else {
			System.out.println("Invalid password");
		}
		sc.close();
	}

}
