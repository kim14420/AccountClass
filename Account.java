package exam8;

public class Account {

	private String account;
	private int balance;
	private double  interestRate;
	
	public Account () {
		account = "000-0000-0000";
		balance = 0;
		interestRate = 0.0;
	}
	
	public Account (String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public void setAccount (String account) {
		this.account = account;
	}
	
	
	public String getAccount() {
		return account;
	}
	
	
	public int getBalance () {
		return balance;
	}
	
	
	public double Calculateinterest () {
		double interestMoney = balance * interestRate / 10.0;
		return interestMoney;
	}
	
	
	public void deposit (int money) {
		balance += money;
	}
	
	
	public void withdraw (int money) {
		balance -= money;
	}

	@Override
	public String toString() {
		return "계좌정보: " + getAccount() + " 현재잔액: " + getBalance();
	}
	
	
}