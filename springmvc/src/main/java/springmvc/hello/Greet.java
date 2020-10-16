package springmvc.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greet {
	@RequestMapping("/hello")
	public String greetings() {
		return "Hello Hardik";
	}
	
}
 