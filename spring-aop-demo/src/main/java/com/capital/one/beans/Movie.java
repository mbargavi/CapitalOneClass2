package com.capital.one.beans;

import org.springframework.stereotype.Component;

@Component
public class Movie {
	public void watchMovie() throws Exception {
		System.out.println("Watching Transformers...");
		//throw new Exception();
	}
}
