package com.springcore.lifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Samosa s =(Samosa)context.getBean("s1");
		double a =s.getPrice();
		System.out.println(a);
		//registering shutdown
		context.registerShutdownHook();
		context.close();
	}

}
