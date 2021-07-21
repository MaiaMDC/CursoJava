package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta account;

		System.out.println("Enter Account Number: ");
		int number = sc.nextInt();

		System.out.println("Enter Account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.println("Is there an initial deposit (Y/N)? ");
		char response = sc.next().charAt(0);

		if (response == 'y' ) {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Conta(number, holder, initialDeposit);
		}
		else {
			account = new Conta(number, holder);
		}
				
		System.out.println();
		System.out.println("Account data: " + account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updatd account data");
		System.out.println(account);
		

		sc.close();
	}

}
