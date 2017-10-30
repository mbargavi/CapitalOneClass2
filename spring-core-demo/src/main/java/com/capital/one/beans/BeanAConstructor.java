package com.capital.one.beans;

public class BeanAConstructor {
	private BeanB b;
	
	public BeanAConstructor() {}
	
	public BeanAConstructor(BeanB b) {
		this.b = b;
	}
	
	public void getBMethod() {
		System.out.println("BeanAConstructor");
		b.getMessage();
	}

}
