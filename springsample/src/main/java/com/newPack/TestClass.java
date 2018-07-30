package com.newPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) 
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	Employee e=(Employee) context.getBean("emp2");
	System.out.println("Details: "+e);
	}

}
