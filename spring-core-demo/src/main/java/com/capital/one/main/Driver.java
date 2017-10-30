package com.capital.one.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capital.one.beans.*;

public class Driver {

	public static void main(String[] args) {
		//BeanASetter bas = new BeanASetter
		//bas.setB(new BeanB("Hi, Java"))
		ApplicationContext context 
			= new ClassPathXmlApplicationContext("beans.xml"); 
		
		//BeanASetter
		//BeanASetter bas = (BeanASetter) context.getBean("BeanBySetter");
		//bas.getBMethod();
		
		//BeanAConstructor
		//BeanAConstructor bac = (BeanAConstructor) context.getBean("BeanByConstructor");
		//bac.getBMethod();
		
		//BeanAByType
		BeanASetter bat = (BeanASetter) context.getBean("BeanByType");
		bat.getBMethod();
		
		//BeanAByName
		//BeanASetter ban = (BeanASetter) context.getBean("BeanByName");
		//ban.getBMethod();
		
		//Automagic
		BeanAAutomagic baa = (BeanAAutomagic) context.getBean("beanAAutomagic");
		baa.getBMethod();
		
		((AbstractApplicationContext) context).close();
	}

}
