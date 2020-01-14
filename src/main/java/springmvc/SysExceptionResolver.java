package springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class SysExceptionResolver implements HandlerExceptionResolver{

	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object hanlder,
			Exception ex) {
		// TODO Auto-generated method stub
		SysException e = null;
		if(ex instanceof SysException)
			e = (SysException) ex;
		else
			e = new SysException("system error");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("errorMsg", e.getMessage());
		mv.setViewName("error");
		
		return mv;
	}

}
