package com.cg.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cg.base.PhpBaseclass;
import com.cg.pages.Phpdemowindow;


public class phpdemowindowtest extends PhpBaseclass{
	Phpdemowindow phppg;
	public phpdemowindowtest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		phppg=new Phpdemowindow();
		driver.get(prop.getProperty("url3"));
		
	}
	
	@Test
	public void phptest() {
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window's handle -> " + parentWindowHandle);
		phppg.clickphpbtn();
		
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); 
		    
		}
		phppg.clickimgbtn();
		
	}
	
	

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
