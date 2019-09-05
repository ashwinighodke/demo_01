package com.cg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cg.base.PhpBaseclass;


public class Phpdemowindow extends PhpBaseclass{
	@FindBy(css="section.grey-box:nth-child(3) div.container div.row div.wow.fadeInUp.col-md-12.animated:nth-child(2) div.resource-box div.row div.col-md-9 div.col-md-12:nth-child(3) div.row div.col-md-6:nth-child(1) div.row a.btn.btn-primary.btn-lg.btn-block > small:nth-child(1)")
	WebElement phpbtn;
	
	@FindBy(xpath="//a[1]//div[1]//div[1]//img[1]")
	WebElement imgbtn;
	
	
	
	public Phpdemowindow() {
		PageFactory.initElements(driver, this);
	}


	public void clickphpbtn() {
		phpbtn.click();
	}

	
	public void clickimgbtn() {
		imgbtn.click();
	}
	
}





