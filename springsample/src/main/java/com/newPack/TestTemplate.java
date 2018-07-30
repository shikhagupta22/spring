package com.newPack;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nucleus.prac.Vendor;

public class TestTemplate {

	public static void main(String[] args) 
	{
			Vendor vendor=new Vendor();
			vendor.setvId("910");
			vendor.setvName("Meera");
			ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
			VendorDAO dao=(VendorDAO) context.getBean("vendordao");
			System.out.println(dao.saveVendor(vendor)+" record has been saved successfully");
			ArrayList<Vendor> vendors= dao.fetchVendor();
			Iterator it=vendors.iterator();
			while(it.hasNext())
			{
				Vendor v=(Vendor) it.next();
				System.out.println(v.getvId()+" "+v.getvName());
			}
	

	}

}
