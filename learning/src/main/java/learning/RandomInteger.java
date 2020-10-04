package learning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class RandomInteger {
	public  void generateRandomIntegers(String location) throws IOException {
		File file = new File(location);
		BufferedWriter buffer;
		if(file.exists()) {
			buffer = new BufferedWriter(new FileWriter(location));  
			for(int i=0;i<100;i++) {
				buffer.write((int) (Math.random()*49+1) + "\n");
			}
		}
		else {
			
			throw new IOException("File not found");
		}
	buffer.close();
	}
	
	public void printRandomNumber(String location) throws IOException {
		ArrayList<Integer> list = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new FileReader(location));
		String line;
		while((line=reader.readLine())!=null) {
			list.add(Integer.parseInt(line));
		}
		System.out.println("Disinct and sorted elements : ");
		list.stream().distinct().sorted().forEach(l->System.out.println(l));
		reader.close();
	}
	
}	