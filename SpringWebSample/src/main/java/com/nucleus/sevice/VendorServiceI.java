package com.nucleus.sevice;

import org.springframework.stereotype.Service;

import com.nucleus.Pojo.Vendor;
@Service
public interface VendorServiceI 
{
	public Vendor view(int id);

}
