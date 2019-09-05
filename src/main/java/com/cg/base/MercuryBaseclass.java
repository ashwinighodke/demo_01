package com.cg.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryBaseclass {
	protected static WebDriver driver;
	protected static Properties prop=new Properties();
	static Logger logger=Logger.getLogger("Test");
	protected MercuryBaseclass() {
		try {
			FileInputStream ip=new FileInputStream(".\\src\\main\\java\\com\\cg\\config\\mercury.properties");
			prop.load(ip);
			
		}
		catch(FileNotFoundException e) {
			logger.log(Level.FINE,"Test {0}.",e);			
		} catch (IOException e) {
			logger.log(Level.FINEST,"Test {0}.",e);			
		}
	}
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
}
