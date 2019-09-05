package com.cg.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cg.base.MercuryBaseclass;

import com.cg.pages.MercuryLogin;


public class MercuryLoginTest extends MercuryBaseclass{
	
	MercuryLogin mercurylog;
	public MercuryLoginTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		mercurylog=new MercuryLogin();
		driver.get(prop.getProperty("url2"));
		
	}
	
	@Test
	public void searchtest() {
		
		
		
		mercurylog.clicksigninbtn();
		mercurylog.setemail(prop.getProperty("email"));
		mercurylog.clickcreateaccbtn();	
		mercurylog.setlname(prop.getProperty("lname"));	
		mercurylog.setfname(prop.getProperty("fname"));
		mercurylog.setpassword(prop.getProperty("password"));
		mercurylog.setaddress(prop.getProperty("address"));
		mercurylog.setcity(prop.getProperty("city"));
		mercurylog.setstate(prop.getProperty("state"));
		mercurylog.setpscode(prop.getProperty("poscode"));
		mercurylog.setcountry(prop.getProperty("country"));
		mercurylog.setphno(prop.getProperty("phno"));
		mercurylog.clickregisterbtn();
		
	}
	
	

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
