package com.nucleus.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nucleus.Pojo.Vendor;

@Repository
public class VendorDao implements VendorDaoI
{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public Vendor view(int id) 
	{
		Vendor vendor=(Vendor)jdbcTemplate.queryForObject("Select * from vendor_shikha where vid=?",new Object[]{id}, Vendor.class);
		return vendor;
		
	}

}
