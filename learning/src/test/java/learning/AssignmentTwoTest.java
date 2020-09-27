package learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssignmentTwoTest {

	@Test
	public void testOne() {
		AssignmentTwo assignmentTwo=new AssignmentTwo();
		assertEquals(0, assignmentTwo.desceningOrder(0));
	}
	 @Test
	    public void testTwo() {
		 	AssignmentTwo assignmentTwo=new AssignmentTwo();
		 	assertEquals(54421 , assignmentTwo.desceningOrder(21445 ));
	    }
	     
	    @Test
	    public void testThree() {
	    	AssignmentTwo assignmentTwo=new AssignmentTwo();
	        assertEquals(654321 , assignmentTwo.desceningOrder(145263 ));
	    }
	    

}
