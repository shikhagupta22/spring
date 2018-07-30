package com.newPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass2 {

	public static void main(String[] args) 
	{
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Message obj=(Message) context.getBean("bean1");
		System.out.println(obj.getMsg());
		context.registerShutdownHook();
	}

}
