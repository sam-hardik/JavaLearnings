package springmvc.test.computer;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputerController {
	@RequestMapping("/computers")
	public List<Computer> getComputerList(){
		return  Arrays.asList(
				new Computer(2, 256, "Dell"),
				new Computer(4, 512, "Hp"),
				new Computer(8, 1024, "Lenovo")
				);
	}
}
