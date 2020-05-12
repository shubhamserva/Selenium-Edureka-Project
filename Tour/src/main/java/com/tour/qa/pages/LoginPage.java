package com.tour.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.tour.qa.mainbase.StartTest;


public class LoginPage extends StartTest{
	//Using page factory to define our elements
	
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement LoginButton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	public HomePage Login(String a, String b)
	{
		username.sendKeys(a);
		password.sendKeys(b);
		LoginButton.click();
		return new HomePage();
	}

}
