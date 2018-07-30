package com.newPack;

public class Org 
{
private String oName;
private String state;
private String city;
public String getoName() {
	return oName;
}
public void setoName(String oName) {
	this.oName = oName;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Org [oName=" + oName + ", state=" + state + ", city=" + city + "]";
}

}
