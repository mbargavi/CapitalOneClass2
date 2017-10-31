package com.capital.one.beans;

import org.springframework.stereotype.Component;

@Component("oven")
public class OvenImpl implements Oven {

	@Override
	public void preheat() {
		System.out.println("Preheating oven...");
		
	}

	@Override
	public void insert() {
		System.out.println("Placing cookie tray in...");
		
	}

}
