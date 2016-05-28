package ssm.springmvc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ssm.springmvc.entity.User;
import ssm.springmvc.service.UserServicce;

@Controller
public class SpringmvcController {
	
	private UserServicce userService;

	@RequestMapping(value = "add", method = { RequestMethod.POST,
			RequestMethod.GET })
	public String add(User user, HttpServletRequest request) {

		System.out.println("add...执行" + user.getUserName());
		request.setAttribute("cs", user.getUserName());
		userService.add(user);
		return "add";
	}

	@RequestMapping(value = "index", method = { RequestMethod.POST,
			RequestMethod.GET })
	public String index() {
		System.out.println("index...执行");
		return "index";
	}

	@Resource(name = "userService")
	public void setUserService(UserServicce userService) {
		this.userService = userService;
	}


}
