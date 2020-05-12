package com.tour.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.tour.qa.mainbase.StartTest;

public class FlightsPage extends StartTest {
	
	
	@FindBy(xpath="//input[@value='oneway']")
	WebElement trip;
	
	public FlightsPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void selecttrip()
	{
		trip.click();
	}
	public void selectPassengers(int n)
	{
		
		WebElement pass=driver.findElement(By.name("passCount"));
		Select people=new Select(pass);
		 people.selectByIndex(n);	 
	}
	public void selectDeparture(String cityname)
	{
		
		WebElement ps1=driver.findElement(By.name("fromPort"));
		Select city=new Select(ps1);
		city.selectByVisibleText(cityname);
	}
	public void selectDay(String month)
	{
		
		WebElement frommonth=driver.findElement(By.name("fromMonth"));
		Select ps =new Select(frommonth);
		ps.selectByVisibleText(month);
	}
	public void selectDate(int date)
	{
		
		WebElement fromdate=driver.findElement(By.name("toDay"));
		Select ps2 =new Select(fromdate);
		ps2.selectByIndex(date);
	}
	public void selectToCity(String arrive)
	{
		
		WebElement toCity=driver.findElement(By.name("toDay"));
		Select ps2 =new Select(toCity);
		ps2.selectByVisibleText(arrive);
	}
	public void selectReturnMonth(String returnmonth)
	{
		
		WebElement tomonth=driver.findElement(By.name("fromMonth"));
		Select ps =new Select(tomonth);
		ps.selectByVisibleText(returnmonth);
	}
	public void selectreturnDate(int returndate)
	{
		
		WebElement todate=driver.findElement(By.name("toDay"));
		Select ps2 =new Select(todate);
		ps2.selectByIndex(returndate);
	}
	public void selectServiceclass()
	{
		WebElement serviceclass=driver.findElement(By.xpath("//input[@value='Coach']"));
		serviceclass.click();
		
	}
	public void selectPreferences(int n)
	{
		
		WebElement airlines=driver.findElement(By.name("airline"));
		Select ps =new Select(airlines);
		ps.selectByIndex(n);
	}
	public void clickOnfindFlight() {
		WebElement findFlight=driver.findElement(By.name("findFlights"));
		findFlight.click();
	}
	

}
