package com.tour.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tour.qa.mainbase.StartTest;

public class HomePage extends StartTest {
	
	@FindBy(xpath="//a[contains(text(),'Flights')]")
	WebElement flights;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle()
	{
		return driver.getTitle();

	}
	public FlightsPage clickonFlightlink()
	{
		Actions action=new Actions(driver);
		action.moveToElement(flights).build().perform();
		 flights.click();
		 return new FlightsPage();
	}
	
	

}
