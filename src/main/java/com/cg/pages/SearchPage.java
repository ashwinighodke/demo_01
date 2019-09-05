package com.cg.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cg.base.Baseclass;

public class SearchPage extends Baseclass{
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
	WebElement registerbtn;
	
	@FindBy(name="firstName")
	WebElement fname;
	
	@FindBy(how=How.NAME,using="lastName")
	WebElement lname;
	
	@FindBy(how=How.NAME,using="phone")
	WebElement phno;
	
	@FindBy(css="input[id='userName']")
	WebElement email;
	
	@FindBy(css="input[name='address1']")
	WebElement address;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(how=How.NAME,using="postalCode")
	WebElement pscode;
	
	@FindBy(name="country")
	WebElement country;
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement pwd;
	
	@FindBy(css="input[name='confirmPassword']")
	WebElement conpwd;
	
	@FindBy(how=How.NAME,using="register")
	WebElement submitbtn;
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}


	public void clickregisterbtn() {
		registerbtn.click();
	}

	public void setfname(String fn) {
		Actions ac=new Actions(driver);
		ac.moveToElement(fname).sendKeys(fname, fn).perform();
	}

	public void setlname(String ln) {
		Actions ac=new Actions(driver);
		ac.moveToElement(lname).sendKeys(lname, ln).perform();
	}
	
	public void setphno(String ph) {
		Actions ac=new Actions(driver);
		ac.moveToElement(phno).sendKeys(phno, ph).perform();
	}
	
	public void setemail(String el) {
		Actions ac=new Actions(driver);
		ac.moveToElement(email).sendKeys(email, el).perform();
	}
	
	public void setaddress(String add) {
		Actions ac=new Actions(driver);
		ac.moveToElement(address).sendKeys(address, add).perform();
	}
	
	public void setcity(String ct) {
		Actions ac=new Actions(driver);
		ac.moveToElement(city).sendKeys(city, ct).perform();
	}
	
	public void setstate(String st) {
		Actions ac=new Actions(driver);
		ac.moveToElement(state).sendKeys(state, st).perform();

	}
	
	public void setpscode(String ps) {
		pscode.sendKeys(ps);
	}
	
	public void setcountry(String cty) {
		Select ctry=new Select(country);
		ctry.selectByValue(cty);
	}
	
	public void setusername(String uname) {
		Actions ac=new Actions(driver);
		ac.moveToElement(username).sendKeys(username, uname).perform();

	}
	
	public void setpwd(String pd) {
		Actions ac=new Actions(driver);
		ac.moveToElement(pwd).sendKeys(pwd, pd).perform();

	}
	
	public void setconpwd(String cpd) {
		Actions ac=new Actions(driver);
		ac.moveToElement(conpwd).sendKeys(conpwd, cpd).perform();

	}
	
	public void clicksubmitbtn() {
		submitbtn.click();
	}
	
}
