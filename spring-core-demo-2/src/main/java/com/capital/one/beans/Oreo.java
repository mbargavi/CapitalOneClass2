package com.capital.one.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Oreo implements Bake {
	@Autowired
	Oven o;

	@Override
	public void getIngredients() {
		System.out.println("Chocolate, Vanilla");
		
	}

	@Override
	public void bakeIt() {
		o.preheat();
		o.insert();
		System.out.println("Bake for some time");
		
	}

}
