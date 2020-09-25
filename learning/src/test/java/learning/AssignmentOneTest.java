package learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssignmentOneTest {

	@Test
	public void equals() throws Exception {
		int a[]= {1,2,4,3,7,8,5};
		AssignmentOne assignmentone=new AssignmentOne();
		int miss=assignmentone.missingElementFinder(a);
		assertEquals(miss,6);
	}
	@Test
	public void notEquals() throws Exception {
		int a[]= {1,2,4,3,7,8,6};
		AssignmentOne assignmentone=new AssignmentOne();
		int miss=assignmentone.missingElementFinder(a);
		assertNotEquals(miss,6);
	}
	@Test
	public void returnsNotNull() throws Exception {
		int a[]= {1,2,4,3,7,8,5};
		AssignmentOne assignmentone=new AssignmentOne();
		int miss=assignmentone.missingElementFinder(a);
		assertNotNull(miss);
	}
	@Test
	public void sameObject() throws Exception {
		int a[]= {1,2,4,3,7,8,5};
		AssignmentOne assignmentone=new AssignmentOne();
		int miss=assignmentone.missingElementFinder(a);
		assertSame(miss,6);
	}
	@Test
	public void emptyArray() throws Exception{
		int a[]= {};
		AssignmentOne assignmentone=new AssignmentOne();
		//int miss=assignmentone.missingElementFinder(a);
		assertThrows(Exception.class,()->{assignmentone.missingElementFinder(a);});
	}
	

}
