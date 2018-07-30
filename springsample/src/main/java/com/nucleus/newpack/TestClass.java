package com.nucleus.newpack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring2.xml");
	    Employee e=(Employee) context.getBean("bean2");
	    System.out.println(e.geteId()+" "+e.geteName());
	}

}
