package learning;

public class PaymentGateway {
	public static boolean transfer(Account sender, Account reciever, int amount) 
	{
		boolean failure=false;
		if(sender.getBalance()>=amount) {
			try {
			sender.withdraw(amount);
			reciever.deposit(amount);
			}
			catch(Exception e) {
				System.out.println("Transfer not possible");
			}
			return !failure;
		}
		else {
			return failure;
		}
	}
}