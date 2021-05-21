package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	void testDeposit() {
		Account c1=new Account("paco",23442,100);
		c1.deposit(50);
		assertEquals(150,c1.getBalance());
		
	}

	@Test
	void testWithdraw() {
		fail("Not yet implemented");
	}

	@Test
	void testAddInterest() {
		fail("Not yet implemented");
	}

}
