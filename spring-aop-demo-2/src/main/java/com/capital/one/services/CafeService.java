package com.capital.one.services;

import org.springframework.stereotype.Component;

@Component
public class CafeService {
	private boolean isOpen = false;
	
	public void setIsOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	
	public boolean getIsOpen() {
		return isOpen;
	}
	
	public void enterCafe() {
		System.out.println("You enter the cafe...");
	}
	
	public void success() {
		System.out.println("You entered the cafe!");
	}
	
	public void failure() {
		System.out.println("It's closed!");
	}
}
