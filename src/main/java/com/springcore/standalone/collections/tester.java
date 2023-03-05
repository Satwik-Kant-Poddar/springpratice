package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.function.SupplierUtils;

public class tester {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
        Person p1=con.getBean("person1",Person.class);
        System.out.println(p1);
    }
}
