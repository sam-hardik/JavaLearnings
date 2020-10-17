package springmvc.test.computer;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputerController {
	@Autowired
	private ComputerService computerService;
	@RequestMapping("/computers")
	public List<Computer> getComputerList(){
		return  computerService.getComputerList();
	}
	@RequestMapping("/computers/{brandName}")
	public Computer getComputersByBrandName(@PathVariable String brandName) {
		return computerService.getComputerByBrandName(brandName);		
	}
	@RequestMapping(method = RequestMethod.POST,value = "/computers")
	public void addComputer(@RequestBody Computer computer) {
		computerService.addComputer(computer);
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/computers/{brandName}")
	public void updateComputer(@RequestBody Computer computer, @PathVariable String brandName) {
		computerService.updateComputer(brandName,computer);
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/computers/{brandName}")
	public void deleteComputer(@PathVariable String brandName) {
		computerService.deleteComputer(brandName);
	}
}
