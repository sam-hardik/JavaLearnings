package learning;

import static org.junit.Assert.*;
//import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RectangleTest {

	@Test
	public void test() throws Exception {
		Rectangle rectangle=new Rectangle();
		float area=rectangle.areaOfRectangle(10, 20);
		assertEquals(area,200,0);
	}
	@Test
	public void testTwo() throws Exception {
		Rectangle rectangle=new Rectangle();
		Rectangle rectangleTwo=new Rectangle();
		assertTrue(rectangle.areaTest(rectangle.areaOfRectangle(10, 20),
				rectangleTwo.areaOfRectangle(10, 20)));
		
	}
	@Test
	public void testThree() throws Exception {
		Rectangle rectangle=new Rectangle();
		assertThrows(Exception.class,()->{rectangle.areaOfRectangle(0,0);});
					
	}
	

}
