package springmvc.test.computer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class ComputerService {
	private List<Computer> computers = new ArrayList<>( Arrays.asList(
			new Computer(2, 256, "Dell"),
			new Computer(4, 512, "Hp"),
			new Computer(8, 1024, "Lenovo")
			));
	public List<Computer> getComputerList(){
		return computers;  
	}
	public Computer getComputerByBrandName(String brandName) {
		return computers.stream()
				.filter(comps->comps.getBrandName().equals(brandName))
				.findFirst().get();
	} 
	public void addComputer(Computer computer) {
		computers.add(computer);
	}
	public void updateComputer(String brandName, Computer computer) {
		for(int i=0;i<computers.size();i++) {
			Computer comps=computers.get(i);
			if(comps.getBrandName().equals(brandName)) {
				computers.set(i, computer);
				return;
			}
		}
		
		
	}
	public void deleteComputer(String brandName) {
		computers.removeIf(comps->comps.getBrandName().equals(brandName));
		
	}
	
}
 