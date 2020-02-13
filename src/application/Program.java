package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();

			System.out.println();

			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			
			account.withdraw(amount);
			System.out.println(String.format("%.2f",account.toString()));

			
		} catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}
