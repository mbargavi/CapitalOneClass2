package com.capital.one.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capital.one.model.User;

@Controller
public class UserController {
	@GetMapping("/validate")
	public @ResponseBody List<String> validate() {
		List<String> errorList = new ArrayList<String>();		
		User u = new User(0, null, "p4ssw0rd");
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = (Validator) factory.getValidator();
		Set<ConstraintViolation<User>> violations = validator.validate(u);
		
		for(ConstraintViolation<User> violation : violations) {
			errorList.add(violation.getPropertyPath() + ", " + violation.getMessage());
		}
		
		return errorList;
	}
}
