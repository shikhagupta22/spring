package com.newPack;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message implements InitializingBean,DisposableBean
{
private String msg;
Message()
{
	System.out.println("Object created..");
}
public String getMsg()
{
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}
@Override
public void afterPropertiesSet() throws Exception 
{
	System.out.println("afterPropertiesSet called");	
}
@Override
public void destroy() throws Exception 
{
		System.out.println("destroy called");
}
public void init()
{
	System.out.println("user defained init called");
}
public void userDestroy()
{
	System.out.println("cleanup task performed..");
}
}
