package com.tour.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.tour.qa.mainbase.StartTest;

public class PayementPage extends StartTest {
	public PayementPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void passenger_FirstNames(String a)
	{
		WebElement FirstName=driver.findElement(By.name("passFirst0"));
		FirstName.sendKeys("a");	
	}
	public void passenger_LastNames(String a)
	{
		WebElement LastName=driver.findElement(By.name("passLast0"));
		LastName.sendKeys("a");
	}
	
	public void religion(String rr)
	{
		WebElement religion=driver.findElement(By.name("pass.0.meal"));
		Select r= new Select(religion);
		r.selectByVisibleText(rr);
	}
	public void cardDetails(int n)
	{
		WebElement card=driver.findElement(By.name("creditCard"));
		Select cc=new Select(card);
		cc.selectByIndex(n);
	}
	public void creditCardNumber( double m)
	{
		WebElement creditCard=driver.findElement(By.name("creditnumber"));
		creditCard.sendKeys("m");
		
	}
	public void ExpiryDetailsDate(int n)
	{
		WebElement exdate=driver.findElement(By.name("cc_exp_dt_mn"));
		Select ex=new Select(exdate);
		ex.selectByIndex(n);
	}
	public void ExpiryDetailsYear(int m)
	{
		WebElement exyear=driver.findElement(By.name("cc_exp_dt_yr"));
		Select ex=new Select(exyear);
		ex.selectByIndex(m);
	}
	public void passengerDetails(String a)
	{
		WebElement first_Passenger_name=driver.findElement(By.name("cc_frst_name"));
		first_Passenger_name.sendKeys("a");	
	}
	public void passengerDetails1(String a)
	{
	
		WebElement Middle_Passenger_name=driver.findElement(By.name("cc_mid_name"));
		Middle_Passenger_name.sendKeys("a");
	}
	public void passengerDetails2(String a)
	{
	
		WebElement last_Passenger_name=driver.findElement(By.name("cc_last_name"));
		last_Passenger_name.sendKeys("a");
	}
	
	public void billing_addr(String n)
	{
		WebElement address_name=driver.findElement(By.name("billAddress1"));
		address_name.sendKeys("n");
	}
	public void billing_city(String m)
	{
		WebElement city_name=driver.findElement(By.name("billCity"));
		city_name.sendKeys("n");
	}
	public void billing_state(String m)
	{
		WebElement state_name=driver.findElement(By.name("billState"));
		state_name.sendKeys("n");
	}
	public void billing_postal(int m)
	{
		WebElement postal_code=driver.findElement(By.name("billZip"));
		postal_code.sendKeys("n");
	}
	public void country_name(int n)
	{
		WebElement country=driver.findElement(By.name("billCountry"));
		Select c_name1=new Select(country);
		 c_name1.selectByIndex(n);
	}
	public void delivery_addr(String n)
	{
		WebElement address_name=driver.findElement(By.name("billAddress1"));
		address_name.sendKeys("n");
	}
	public void delivery_city(String m)
	{
		WebElement city_name=driver.findElement(By.name("delCity"));
		city_name.sendKeys("n");
	}
	public void delivery_state(String m)
	{
		WebElement city_name=driver.findElement(By.name("delState"));
		city_name.sendKeys("n");
	}
	public void delivery_postalcode(int m)
	{
		WebElement city_name=driver.findElement(By.name("delZip"));
		city_name.sendKeys("n");
	}
	public void country_name_2(int n)
	{
		WebElement country=driver.findElement(By.name("delCountry"));
		Select c_name1=new Select(country);
		 c_name1.selectByIndex(n);
	}
	
	public void buy_a_flight() {
		WebElement purchase=driver.findElement(By.name("buyFlights"));
		purchase.click();
	}

}
