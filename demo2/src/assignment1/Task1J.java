package assignment1;

import java.util.Scanner;

public class Task1J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter creditScore");
		int creditScore=sc.nextInt();
		System.out.println("Enter annualIncome");
		int annualIncome=sc.nextInt();
		
		if(creditScore>700 && annualIncome>=50000) {
			System.out.println("You are elegible for a loan");
		}else {
			System.out.println("You are not eigible for a loan");
		}
sc.close();
	}

}
