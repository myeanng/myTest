package ssm.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class SpringmvcController {
	@RequestMapping(value="add" , method={RequestMethod.POST , RequestMethod.GET})
	public String add(String cs,HttpServletRequest request){
		
		System.out.println("add...执行"+cs);
		request.setAttribute("cs", cs);
		return "add";
	}
	@RequestMapping(value="index" , method={RequestMethod.POST , RequestMethod.GET})
	public String index(){
		System.out.println("index...执行");
		return "index";
	}
}
