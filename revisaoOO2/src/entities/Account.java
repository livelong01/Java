package entities;

public class Account {

	private Integer number;
	private String holder;
	private Double balance = 0.00;
	
	public Account() {
	}
	
	public Account(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit (Double amont) {
		balance += amont;
	}
	
	public void withdraw (Double amont) {
		balance -= amont +5;
	}
	
	public String toString() {
		return "Account " + number
				+ ", Holder: " + holder
				+ ", Balance: $ " + String.format("%.2f", balance);
	}
	
	
	
}
