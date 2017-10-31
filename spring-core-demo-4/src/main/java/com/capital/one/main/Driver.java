package com.capital.one.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capital.one.beans.Customer;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Customer johnsmith = (Customer) context.getBean("customer");
		johnsmith.report();
		johnsmith.deposit(200);
		((AbstractApplicationContext) context).close();
	}

}
