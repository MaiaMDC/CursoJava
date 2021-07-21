package entities;

public class Conta {

	private int number;
	private String holder;
	private double balance;

	public Conta(int account, String holder, double initialDeposit) {
		this.number = account;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Conta(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public int getAccount() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public String toString() {
		return "Account: "
				+ number
				+	", Holder: "
				+ holder
				+ ", Balance: "
				+ String.format("%.2f", balance);
	}
}