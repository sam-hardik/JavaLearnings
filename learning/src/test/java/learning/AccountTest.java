package learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void test() {
		Account accountOne = new Account("Hardik",5000);
		accountOne.displayAccountDetails();
		Account.getNextAccountNumber();
		Account accountTwo = new Account("XYZ",500);
		accountOne.displayAccountDetails();
		boolean paymentStatus = PaymentGateway.transfer(accountTwo,accountOne, 200);
		if(paymentStatus) {
			System.out.println("Funds transfered successfully");
		}
		else {
			System.out.println("Funds transfered failed due to insufficient balance");
		}
	}

}
