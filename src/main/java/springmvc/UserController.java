package springmvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("testString")
	public String testString (Model model) {
		System.out.println("testString");
		User user = new User();
		user.setUsername("tom");
		user.setPassword("1");
		user.setAge(20);
		
		model.addAttribute("user", user);
		
		return "success";
	}
	
	@RequestMapping("testVoid")
	public void testVoid (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("testVoid");
//		request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response );
		response.getWriter().print("hello");
		return;
	}
	
	@RequestMapping("testModelAndView")
	public ModelAndView testModelAndView (){
		ModelAndView mv = new ModelAndView();
		System.out.println("testModelAndView");
		User user = new User();
		user.setUsername("tom");
		user.setPassword("1");
		user.setAge(20);
		
		mv.addObject("user", user);
		mv.setViewName("success");
		
		return mv;
	}
	
	@RequestMapping("testForwardOrRedirect")
	public String testForwardOrRedirect (){
		System.out.println("testForwardOrRedirect");
		
		return "forward:/WEB-INF/pages/success.jsp";
	}
	
	@RequestMapping("testAjax")
	public @ResponseBody User testAjax (@RequestBody User user){
		System.out.println("testAjax");
		System.out.println(user);
		user.setUsername("haha");
		user.setAge(40);
		
		return user;
	}

}
