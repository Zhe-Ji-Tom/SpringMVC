package springmvc;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/param")
public class ParamController {

	@RequestMapping("/testParam")
	public String testParam(String username, String password) {
		System.out.println("execute"+username+password);
		return "success";
	}
	
	@RequestMapping("/saveAccount")
	public String saveAccount(Account account) {
		System.out.println(account);
		return "success";
	}
	
	@RequestMapping("/saveUser")
	public String saveUser(User user) {
		System.out.println(user);
		return "success";
	}
	
	@RequestMapping("/testServlet")
	public String testServlet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("execute");
		System.out.println(request);
		HttpSession session = request.getSession();
		System.out.println(session);
		ServletContext servletContext = session.getServletContext();
		System.out.println(servletContext);
		System.out.println(response);
		return "success";
	}
}
