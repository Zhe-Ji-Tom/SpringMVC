package springmvc;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping(path="/anno")
@SessionAttributes(value={"msg"})
public class AnnoController {
	
	@RequestMapping(path="/testRequestParam")
	public String testRequestParam(@RequestParam(value="name") String username) {
		System.out.println("execute");
		System.out.println(username);
		return "success";
	}
	
	@RequestMapping(path="/testRequestBody")
	public String testRequestBody(@RequestBody String body) {
		System.out.println(body);
		return "success";
	}
	
	@RequestMapping(path="/testPathVariable/{id}")
	public String testPathVariable(@PathVariable(name="id") String id) {
		System.out.println(id);
		return "success";
	}
	
	@RequestMapping(path="/testRequestHeader")
	public String testRequestHeader(@RequestHeader(name="Accept") String header) {
		System.out.println(header);
		return "success";
	}
	
	@RequestMapping(path="/testCookieValue")
	public String testCookieValue(@CookieValue(name="JSESSIONID") String cookie) {
		System.out.println(cookie);
		return "success";
	}
	
	@RequestMapping(path="/testModelAttribute")
	public String testModelAttribute(@ModelAttribute(value="abc") User user) {
		System.out.println("ModelAttribute");
		System.out.println(user);
		return "success";
	}
	
//	@ModelAttribute
//	public void showUser(String uname, Map<String,User> map) {
//		System.out.println("showUser");
//		User user = new User();
//		user.setUname(uname);
//		user.setAge(30);
//		user.setDate(new Date());
//		map.put("abc", user);
//	}
	
	/*
	 * @ModelAttribute public User showUser(String uname) {
	 * System.out.println("showUser"); User user = new User(); user.setUname(uname);
	 * user.setAge(30); user.setDate(new Date());
	 * 
	 * return user; }
	 */
	
	@RequestMapping(path="/testSessionAttributes")
	public String testSessionAttributes(Model model) {
		System.out.println("SessionAttributes");
		model.addAttribute("msg", "tom");
		return "success";
	}
	
	@RequestMapping(path="/getSessionAttributes")
	public String getSessionAttributes(ModelMap modelMap) {
		System.out.println("getSessionAttributes");
		System.out.println(modelMap.get("msg"));
		return "success";
	}
	
	@RequestMapping(path="/delSessionAttributes")
	public String delSessionAttributes(SessionStatus status) {
		System.out.println("delSessionAttributes");
		status.setComplete();
		return "success";
	}
}
