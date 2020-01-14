package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/user",params= {"username"})
public class HelloController {
	
	@RequestMapping(path="/hello")
	public String sayHello() {
		System.out.println("Hello SpringMVC!");
		return "success";
	}
	
	@RequestMapping(path="/testRequestMapping")
	public String testRequestMapping() {
		System.out.println("Test RequestMapping");
		return "success";
	}
}



