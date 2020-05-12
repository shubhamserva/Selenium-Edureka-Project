package com.tour.qa.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tour.qa.mainbase.StartTest;
import com.tour.qa.pages.HomePage;
import com.tour.qa.pages.LoginPage;

import junit.framework.Assert;
public class LoginPageTest extends StartTest {
	LoginPage lp;
	HomePage hp;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void SetUp()
	{
	initialization();
	lp =new LoginPage();
	}
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title=lp.validateLoginPageTitle();
		Assert.assertEquals(title, "Welcome: Mercury Tours");
	}
	
	@Test(priority=2)
	public void loginTest()
	{
		hp=lp.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
