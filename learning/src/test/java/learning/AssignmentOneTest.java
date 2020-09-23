package learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssignmentOneTest {

	@Test
	public void test() {
		int a[]= {1,2,4,3,7,8,5};
		AssignmentOne assignmentone=new AssignmentOne();
		int miss=assignmentone.missingElementFinder(a);
		assertEquals(miss,6);
	}
	@Test
	public void testTwo() {
		int a[]= {1,2,4,3,7,8,6};
		AssignmentOne assignmentone=new AssignmentOne();
		int miss=assignmentone.missingElementFinder(a);
		assertNotEquals(miss,6);
	}
	@Test
	public void testThree() {
		int a[]= {1,2,4,3,7,8,5};
		AssignmentOne assignmentone=new AssignmentOne();
		int miss=assignmentone.missingElementFinder(a);
		assertNotNull(miss);
	}
	@Test
	public void testFour() {
		int a[]= {1,2,4,3,7,8,5};
		AssignmentOne assignmentone=new AssignmentOne();
		int miss=assignmentone.missingElementFinder(a);
		assertSame(miss,6);
	}
	

}
