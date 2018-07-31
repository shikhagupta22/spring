package com.nucleus.dao;

import org.springframework.stereotype.Repository;

import com.nucleus.Pojo.Vendor;
@Repository
public interface VendorDaoI {

	public Vendor view(int id);

}
