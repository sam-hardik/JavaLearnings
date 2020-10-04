package learning;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class RandomIntegerTest {

	@Test
	public void test() throws IOException {
		String location = "D:\\capgemini_training\\java\\work\\src\\main\\java\\streams\\test.txt";
		RandomInteger randomInteger=new RandomInteger();
		randomInteger.generateRandomIntegers(location);
		randomInteger.printRandomNumber(location);
	}

}
