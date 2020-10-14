import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TriangleController {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("main.xml");
		Triangle triangle=(Triangle) context.getBean("triangle");
		triangle.draw();
	}

}
