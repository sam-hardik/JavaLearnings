package learning;

public class Account {
	private String name;
	private int balance=0;
	static int accountNumber=100;
	private int acc = accountNumber;
	{
		accountNumber++;
	}
	
	public Account(String name) {
		super();
		this.name = name;
	}
	public Account(String name, int balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void displayAccountDetails() {
		System.out.println("Name : " + this.name);
		System.out.println("Balance : " + this.balance);
		System.out.println("Account number : " + this.acc);
	}
	public void deposit(int num) {
		this.balance = this.balance + num;
	}
	public void withdraw(int num) throws Exception{
	
			if(num>this.balance) {
				throw new Exception("Amount exceeding balance available");
				//System.out.println("Amount exceeding balance available");
			}
			else {
				this.balance = this.balance -num;
			}
	}
	public static void getNextAccountNumber() {
		System.out.println("Next available account number is  : " + Account.accountNumber);
	}
	
}