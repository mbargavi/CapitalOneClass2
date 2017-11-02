package com.capital.one.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capital.one.model.User;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(value="", method=RequestMethod.GET)
	public String helloWorld() {
		return "/html/hello.html";
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index() {
		return "/html/index.html";
	}
	
	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	public String helloName(@PathVariable("name") String n) {
		System.out.println(n);
		if (n.equals("mehrab")) {
			return "redirect:/hello/index";
		} else {
			return "redirect:/hello";
		}
	}
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public ResponseEntity<Object> getUser() {
		User u = new User("admin", "admin");
		return ResponseEntity.ok(u);
	}
	
	@RequestMapping(value="/{username}/{password}", method=RequestMethod.GET)
	public @ResponseBody User getUsernamepassword(
			@PathVariable("username") String username, @PathVariable("password") String password) {
		User newUser = new User(username, password);
		return newUser;
	}
}







