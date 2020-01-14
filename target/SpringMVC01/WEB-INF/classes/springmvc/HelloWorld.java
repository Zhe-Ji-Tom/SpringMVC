package springmvc;	

@Controller
public class HelloController {
	
	@RequestMapping(path="/hello")
	public String sayHello() {
		System.out.println("Hello SpringMVC!");
		return "success";
	}
}

