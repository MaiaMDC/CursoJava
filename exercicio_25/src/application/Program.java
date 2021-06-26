package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee Emp = new Employee();

		System.out.println("Name");
		Emp.Name = sc.nextLine();

		System.out.println("Gross salary: ");
		Emp.grossSalary = sc.nextDouble();

		System.out.println("tax");
		Emp.tax = sc.nextDouble();

		System.out.println(Emp);

		System.out.println("Which percentage to increase salary?");
		double porcento = sc.nextDouble();
		Emp.IncreaseSalary(porcento);
		
		System.out.println("Updated data:" + Emp);
		
		
		sc.close();
	}
}
