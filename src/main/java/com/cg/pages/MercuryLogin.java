package com.cg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cg.base.MercuryBaseclass;


public class MercuryLogin extends MercuryBaseclass{
	@FindBy(xpath="//*[@id=\'header\']/div[2]/div/div/nav/div[1]/a")
	WebElement signinbtn;
	
	@FindBy(xpath="//input[@id='email_create']")
	WebElement email;
	
	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
	WebElement createaccbtn;
	
	@FindBy(xpath="//input[contains(@id,'customer_firstname')]")
	WebElement fname;
	
	@FindBy(xpath="//div[@class='required form-group']//input[@name='customer_lastname']")
	WebElement lname;
	
	@FindBy(xpath="//input[starts-with(@id,'passwd')]")
	WebElement password;
	
	@FindBy(css="#address1")
	WebElement address;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath="//form[@id='account-creation_form']//descendant::select[@id='id_state']")
	WebElement state;
	
	@FindBy(how=How.ID,using="postcode")
	WebElement pscode;
	
	@FindBy(css="#id_country")
	WebElement country;
	
	@FindBy(how=How.ID,using="phone_mobile")
	WebElement phno;
	
	@FindBy(xpath="//span[contains(text(),'Register')]")
	WebElement registerbtn;
	
	public MercuryLogin() {
		PageFactory.initElements(driver, this);
	}


	public void clicksigninbtn() {
		signinbtn.click();
	}

	public void setemail(String el) {
		Actions ac=new Actions(driver);
		ac.moveToElement(email).sendKeys(email, el).perform();
	}
	
	public void clickcreateaccbtn() {
		createaccbtn.click();
	}
	
	public void setfname(String fn) {
		Actions ac=new Actions(driver);
		ac.moveToElement(fname).sendKeys(fname, fn).perform();
	}

	public void setlname(String ln) {
		Actions ac=new Actions(driver);
		ac.moveToElement(lname).sendKeys(lname, ln).perform();
	}
	
	public void setpassword(String pd) {
		Actions ac=new Actions(driver);
		ac.moveToElement(password).sendKeys(password, pd).perform();

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
		Select stt=new Select(state);
		stt.selectByVisibleText(st);
	}
	
	public void setpscode(String ps) {
		pscode.sendKeys(ps);
	}
	
	public void setcountry(String cty) {
		Select ctry=new Select(country);
		ctry.selectByVisibleText(cty);
	}
	
	public void setphno(String ph) {
		Actions ac=new Actions(driver);
		ac.moveToElement(phno).sendKeys(phno, ph).perform();
	}
	
	public void clickregisterbtn() {
		registerbtn.click();
	}
	
	
}
