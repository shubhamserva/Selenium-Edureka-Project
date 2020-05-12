package com.tour.qa.testcases;

import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.tour.qa.mainbase.StartTest;
import com.tour.qa.pages.HomePage;
import com.tour.qa.pages.LoginPage;

public class HomePageTest extends StartTest {
	LoginPage lp;
	HomePage hp;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		lp=new LoginPage();
		hp=lp.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@Test
	public void verifyHomePageTitleTest()
	{
	String title1=hp.validateHomePageTitle();
    Assert.assertEquals(title1,"Welcome: Mercury Tours");
	}

}
