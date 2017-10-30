package com.capital.one.beans;

public class BeanB {
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
		System.out.println("setting message");
	}
	
	public void getMessage() {
		System.out.println("Your message: " + message);
	}
	
}
