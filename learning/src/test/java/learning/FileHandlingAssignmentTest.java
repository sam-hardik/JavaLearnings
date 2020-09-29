package learning;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class FileHandlingAssignmentTest {

	@Test
	public void testExistanceOfFile() throws IOException {
		FileHandlingAssignment fileHandlingAssignment=new FileHandlingAssignment();
		boolean result=fileHandlingAssignment.doesFileExist("F:/JavaLearning/learning/src/main/java/learning/File.txt");
		assertTrue(result);
		}
	@Test
	public void testLineCount() throws IOException {
		FileHandlingAssignment fileHandlingAssignment=new FileHandlingAssignment();
		int result=fileHandlingAssignment.countTotalNumberOfLinesInFile("F:/JavaLearning/learning/src/main/java/learning/File.txt");
		assertEquals(result,1);
		}
	@Test
	public void testWordCount() throws IOException {
		FileHandlingAssignment fileHandlingAssignment=new FileHandlingAssignment();
		int result=fileHandlingAssignment.countTotalWordsInFile("F:/JavaLearning/learning/src/main/java/learning/File.txt");
		assertEquals(result,5);
		}


}
