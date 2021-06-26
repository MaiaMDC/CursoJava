package entities;

public class Employee {
	
	public String Name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public void IncreaseSalary(double percentage) {
		this.grossSalary += percentage * grossSalary / 100;
	}
	
	public String toString() {
		return "Employee: "
			+ Name
			+ ", $ "
			+ NetSalary();
			}

}
