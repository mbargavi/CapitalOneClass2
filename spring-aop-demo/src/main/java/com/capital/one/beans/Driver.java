package com.capital.one.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) throws Exception {
		//Load beans.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//Fetch a movie bean
		Movie myMovie = (Movie) context.getBean("movie");
		
		myMovie.watchMovie();

	}

}
