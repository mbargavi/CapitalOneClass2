package com.capital.one.beans;

public class BeanASetter {
	private BeanB b;
	
	public void setB(BeanB b) {
		this.b = b;
	}
	
	public void getBMethod() {
		System.out.println("BeanASetter");
		b.getMessage();
	}

}
