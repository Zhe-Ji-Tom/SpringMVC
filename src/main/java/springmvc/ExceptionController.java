package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class ExceptionController {

	@RequestMapping("/testException")
	public String testException() throws SysException{
		System.out.println("testException");
		try {
			int i = 10 / 0;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new SysException("error");
		}
		return "success";
	}
}
