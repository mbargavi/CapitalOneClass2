package com.capital.one.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capital.one.services.CafeService;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CafeService cs = (CafeService) context.getBean("cafeService");
		cs.enterCafe();

	}

}
