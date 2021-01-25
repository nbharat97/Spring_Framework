package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		Burger b = (Burger) context.getBean("burger");
		context.registerShutdownHook();
		
		System.out.println(b.getPrice());
		
		Pizza p = (Pizza) context.getBean("pizza");
		System.out.println(p);
		
		Frankie frankie = (Frankie) context.getBean("frankie");
		System.out.println(frankie);
		
		
	}
}
