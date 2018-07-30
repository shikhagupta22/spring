package com.newPack;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.nucleus.prac.Vendor;

public class VendorDAO 
{
@Autowired
private JdbcTemplate jdbcTemplate;

public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
public int saveVendor(Vendor v)
{
	int c=this.jdbcTemplate.update("insert into vendors values("+v.getvId()+",'"+v.getvName()+"')");
    return c;
}
public ArrayList<Vendor>fetchVendor()
{
	ArrayList<Vendor> vList=new ArrayList<Vendor>();
	List<Map<String, Object>> map=this.jdbcTemplate.queryForList("select * from vendors");
	for (Map row : map) {
        Vendor v=new Vendor();
		v.setvId((String)row.get("vid"));
		v.setvName((String)row.get("vName"));	
		vList.add(v);
	}
	return vList;
}

	
}

