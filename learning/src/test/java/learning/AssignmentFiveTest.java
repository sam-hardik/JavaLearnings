package learning;
import static org.junit.Assert.*;

import java.util.Scanner;

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
		
		Scanner obj=new Scanner(System.in);
		int id=1,monthlyBasic=obj.nextInt(); //Test Pass for 5000
		String name="Hardik";
				
		AssignmentFive anf=new AssignmentFive(id,monthlyBasic,name);
		anf.setPfRate(10);
		anf.getPfRate();
		float annual=anf.getAnnualTakeHome();
		assertEquals(annual,105150,0);
	}

}
