package com.capital.one.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capital.one.beans.*;

public class Driver {

	public static void main(String[] args) {
		//Load beans.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//Fetch bean and load
		Bake oreoTray = (Oreo) context.getBean("oreo");
		oreoTray.getIngredients();
		oreoTray.bakeIt();


		Bake sc = (SugarCookie) context.getBean("sugarCookie");
		sc.getIngredients();
		sc.bakeIt();
	}

}
