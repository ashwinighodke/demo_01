package com.cg.tests;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cg.base.MercuryBaseclass;
import com.cg.pages.MercurySignin;

public class MercurySignTest extends MercuryBaseclass{
	MercurySignin mercurysign;
	public MercurySignTest() {
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		mercurysign=new MercurySignin();
		driver.get(prop.getProperty("url2"));
		
	}
	
	@Test
	public void signintest() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		mercurysign.clicksigninbtn();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email")));
		String eml = "";
		String ps = "";
		
		HashMap<String, String> map = new HashMap(); 
		
		try {
			File file =    new File(System.getProperty("user.dir")+"\\src\\main\\resouces\\testData2.xlsx");
		    FileInputStream inputStream = new FileInputStream(file);
		    XSSFWorkbook book = new XSSFWorkbook(inputStream);
		    Sheet sheet = book.getSheetAt(0);
		    for(int i = 0; i < 2; i++)
		    {
		    	Row row = sheet.getRow(i);
		    	map.put(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
		    }
		    //eml = row.getCell(0).getStringCellValue();
		    //ps = row.getCell(1).getStringCellValue();
		    System.out.println("!!!!   "+ eml + "   "+ ps + "    !!!!!");
		}
		catch(Exception e)
		{System.out.println("#############HERE:  "+ e.getMessage());}
		
		mercurysign.setemail(map.get("fname").toString());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='passwd']")));
		mercurysign.setpassword(map.get("lname").toString());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='submit']//span[1]")));
		mercurysign.clicksubmitbtn();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Home')]")));
		mercurysign.clickhomebtn();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]")));
		mercurysign.clickcasualchoice();
	}
	
	

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
