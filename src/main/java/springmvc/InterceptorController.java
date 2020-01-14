package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class InterceptorController {
	
	@RequestMapping("/testInterceptor")
	public String testInterceptor() {
		System.out.println("testInterception");
		
		return "success";
	}
}
