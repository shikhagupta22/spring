package com.nucleus.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nucleus.Pojo.Vendor;
import com.nucleus.sevice.VendorServiceI;

@Controller
public class TestController 
{
	@Autowired
	VendorServiceI vendorServiceI;
	@RequestMapping("insert")
	public String insert()
	{
		return "insert";
	}
	@RequestMapping("view")
	public String view()
	{
		return "view";
	}
	@RequestMapping("welcome")
	public String welcome()
	{
		return "welcome";
	}
	@RequestMapping("delete")
	public String delete()
	{
		return "delete";
	}
	@RequestMapping("update")
	public String update()
	{
		return "update";
	}
	@RequestMapping(value="viewbyid", method=RequestMethod.GET)
	public ModelAndView viewById(@RequestParam("id") String id)
    {
		int id1=Integer.parseInt(id);
		Vendor vendor=vendorServiceI.view(id1);
		return new ModelAndView("welcome");
    }
	

}
