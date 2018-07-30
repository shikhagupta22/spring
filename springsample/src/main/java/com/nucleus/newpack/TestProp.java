package com.nucleus.newpack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProp 
{
@Autowired
private MessageSource messageSource;
public void show()
{
	System.out.println("ID: "+this.messageSource.getMessage("employee.ei",new Object []{"999"}, "something went wrong", null));
	System.out.println("Name: "+this.messageSource.getMessage("employee.ename",new Object []{1,"kausar"}, "something went wrong", null));
}
public static void main(String[] args) 
{
	ApplicationContext context=new ClassPathXmlApplicationContext("spring2.xml");
   TestProp e=(TestProp) context.getBean("obj");
   e.show();}
}
