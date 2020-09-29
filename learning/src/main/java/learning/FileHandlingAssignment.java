package learning;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileHandlingAssignment {

	public boolean doesFileExist(String path) throws IOException {
		File file =new File(path);
		if(file.exists()) {
			return true;
		}
		else throw new FileNotFoundException();
	}
	public int countTotalNumberOfLinesInFile(String filePath) throws IOException {
		File file = new File(filePath);
		if(file.exists()) {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			int lines = 0;
			while (reader.readLine() != null) lines++;
			reader.close();
			return lines;
		} 
		else throw new FileNotFoundException();
		
	}
	public int countTotalWordsInFile(String filePath) throws IOException {
		File file = new File(filePath);
		if(file.exists()) {
			String line;
			int wordCount=0;
			FileReader fileReader=new FileReader(filePath);
	        BufferedReader reader = new BufferedReader(fileReader); 
	        while((line=reader.readLine())!=null) {
	        	String words[]=line.split(" ");
	        	wordCount+=words.length;
	        }
	        reader.close();
	        return wordCount;
		}
		else throw new FileNotFoundException();
	}

	
}
