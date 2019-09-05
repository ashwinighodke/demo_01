package com.cg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cg.base.MercuryBaseclass;


public class MercurySignin extends MercuryBaseclass{
	@FindBy(xpath="//a[@class='login']")
	WebElement signinbtn;
	
	@FindBy(css="#email") 
	WebElement email;
	
	@FindBy(how=How.XPATH,using="//input[@id='passwd']")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//p[@class='submit']//span[1]")
	WebElement submitbtn;

	@FindBy(xpath="//span[contains(text(),'Home')]")
	WebElement homebtn;
	
	@FindBy(xpath="//a[@class='sf-with-ul'][contains(text(),'Women')]")
	WebElement womenbtn;

	@FindBy(xpath="//ul[@class='submenu-container clearfix first-in-line-xs']//ul//li//a[contains(text(),'Casual Dresses')]")
	WebElement choice;
	
	public MercurySignin() {
		PageFactory.initElements(driver, this);
	}


	public void clicksigninbtn() {
		signinbtn.click();
	}

	public void setemail(String el) {
		Actions ac=new Actions(driver);
		ac.moveToElement(email).sendKeys(email, el).perform();
	}
	
	public void setpassword(String pd) {
		Actions ac=new Actions(driver);
		ac.moveToElement(password).sendKeys(password, pd).perform();

	}
	
	public void clicksubmitbtn() {
		submitbtn.click();
	}
	
	public void clickhomebtn() {
		homebtn.click();
	}
	
	public void clickcasualchoice() {
		Actions ac=new Actions(driver);
		ac.moveToElement(womenbtn).perform();
		ac.moveToElement(choice).click().perform();
	}
}
