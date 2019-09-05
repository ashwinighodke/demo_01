package com.cg.tests;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cg.base.Baseclass;
import com.cg.pages.SearchPage;

public class SearchPageTest extends Baseclass{
	SearchPage searchpg;
	public SearchPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		searchpg=new SearchPage();
		driver.get(prop.getProperty("url1"));
		
	}
	
	@Test
	public void searchtest() {
		searchpg.clickregisterbtn();
		searchpg.setfname(prop.getProperty("firstname"));
		searchpg.setlname(prop.getProperty("lastname"));
		searchpg.setphno(prop.getProperty("phone"));
		searchpg.setemail(prop.getProperty("email"));
		searchpg.setaddress(prop.getProperty("add"));
		searchpg.setcity(prop.getProperty("city"));
		searchpg.setstate(prop.getProperty("state"));
		searchpg.setpscode(prop.getProperty("postalcode"));
		searchpg.setcountry(prop.getProperty("country"));
		searchpg.setusername(prop.getProperty("usernm"));
		searchpg.setpwd(prop.getProperty("passwd"));
		searchpg.setconpwd(prop.getProperty("conpasswd"));
		searchpg.clicksubmitbtn();
	}
	
	

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
