package com.nucleus.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nucleus.Pojo.Vendor;
import com.nucleus.dao.VendorDaoI;
@Service
public class VendorService implements VendorServiceI
{
	@Autowired
	VendorDaoI vendorDaoI;
	@Override
	public Vendor view(int id) 
	{
		Vendor vendor=vendorDaoI.view(id);
		return vendor;
		
	}
	

}
