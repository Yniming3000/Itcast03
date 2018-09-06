package cn.itcast.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class SysExceptionResolver implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		 ex.printStackTrace();
		 SysException e=null;
		 if(ex instanceof SysException) {
			  e=(SysException)ex;
		 }else {
			 e=new SysException("服务器异常");
		 }
		 
		 ModelAndView view = new ModelAndView();
		 view.addObject("message", e.getMessage());
		 view.setViewName("exception");
		// TODO Auto-generated method stub
		return view;
	}

}
