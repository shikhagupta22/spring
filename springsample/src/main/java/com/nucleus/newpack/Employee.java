package com.nucleus.newpack;

import org.springframework.beans.factory.InitializingBean;

public class Employee  //implements InitializingBean
{
private int eId;
private String eName;
Employee()
{
	System.out.println("Object created");
}
public int geteId() {
	return eId;
}
public void seteId(int eId) {
	this.eId = eId;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
/*@Override
public void afterPropertiesSet() throws Exception 
{
System.out.println("Bean Initialized");
	
}*/
}
