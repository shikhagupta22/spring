package com.newPack;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee 
{
private int empId;
private String eName;
@Autowired
private Org org;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public Org getOrg() {
	return org;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", eName=" + eName + ", org=" + org
			+ "]";
}
public void setOrg(Org org) {
	this.org = org;
}

}
