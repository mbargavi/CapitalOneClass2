package com.capital.one.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanAAutomagic {
	@Autowired
	private BeanB b;
	
	public void getBMethod() {
		System.out.println("BeanAConstructor");
		b.getMessage();
	}
}
