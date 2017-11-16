package com.capital.one.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice(basePackages="com.capital.one.controller")
public class RestExceptionProcessor {
	
	//Map NotFoundException to a 404
	@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason="This artist id is not found")
	@ExceptionHandler({Exception.class})
	public void handleNotFound(Exception ex) {
		System.out.println("Doesn't exist");
	}
}
