/**
 * 
 */
package com.docker.todo.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author satya
 *
 */
@Controller
public class LoginController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login(Model model) {
			return "login";
	}
 
	@RequestMapping(value = "/loginform", method = RequestMethod.POST)
	public String login(@RequestParam(name="userName", required=true) String userName, 
			@RequestParam(name="password", required=true) String password, Model model) {
		
		System.out.println("User Name " + userName);
		System.out.println("Password " + password);
		if (true)
			return "welcome";
		else
			return "login";
	}
	
	public String logout(@RequestParam(name="userName", required=true) String userName, Model model) {
		return "home";
	}
}
