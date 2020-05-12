package com.tour.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.tour.qa.mainbase.StartTest;

public class SelectFlightPage extends StartTest{

	public SelectFlightPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void selectFlight(int n)
	{
		WebElement flightNo= driver.findElement(By.xpath("//input[@type='radio'][n]]"));
		flightNo.click();
	}
	public PayementPage click_On_Continue()
	{
		WebElement button=driver.findElement(By.name("reserveFlights"));
		button.click();
		return new PayementPage();
	}
	
}
