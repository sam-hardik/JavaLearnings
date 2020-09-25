package learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssignmentFiveTest {

	@Test
	public void getAnnualBasicTest() {
		int id=1,monthlyBasic=20000;
		String name="Hardik";
		AssignmentFive anf=new AssignmentFive(id,monthlyBasic,name);
		anf.setPfRate(10);
		float annual=anf.getAnnualTakeHome();
		assertEquals(annual,359400,0);
	}
	@Test
	public void getAnnualBasicTestTwo() {
		int id=1,monthlyBasic=5000;
		String name="Hardik";
		AssignmentFive anf=new AssignmentFive(id,monthlyBasic,name);
		anf.setPfRate(10);
		float annual=anf.getAnnualTakeHome();
		assertEquals(annual,105150,0);
	}

}
