package com.tour.qa.mainbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tour.qa.util.TestUtil;

public class StartTest {
	public static WebDriver driver;
	public static Properties prop;
	
	public StartTest()// creating Constructor to load the properties files.
	{
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\user\\Downloads\\Tour\\Tour\\src\\main\\java\\com\\tour\\qa\\config");
			prop.load(fis);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	// intialization method to open the chrome browser.
	
	public static void initialization()
	{
		String browserName=prop.getProperty("browser");
		if (browserName .equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/C:/Users/M1050330/Downloads/chromedriver_76");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"))	;
		}
	

}
