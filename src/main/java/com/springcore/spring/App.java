package com.springcore.spring;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =
        		new ClassPathXmlApplicationContext("com/springcore/spring/config.xml");
        Student s1 = (Student ) context.getBean("s1");
        System.out.println(s1);
        s1 = (Student ) context.getBean("s2");
        System.out.println(s1);
        s1 = (Student ) context.getBean("s3");
        System.out.println(s1);
    }
    
}
