package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =
				new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
        Address a = (Address) context.getBean("ad1");
        System.out.println(a.toString());
        context =
				new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
        Student b = (Student) context.getBean("s1");
        System.out.println(b.toString());
	}

}
