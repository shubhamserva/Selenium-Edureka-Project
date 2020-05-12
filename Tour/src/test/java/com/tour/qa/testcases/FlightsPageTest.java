package com.tour.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.tour.qa.mainbase.StartTest;
import com.tour.qa.pages.FlightsPage;
import com.tour.qa.pages.HomePage;
import com.tour.qa.pages.LoginPage;

public class FlightsPageTest extends StartTest{
	LoginPage lp;
	HomePage hp;
	FlightsPage fp;
	
	public FlightsPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp()
	{
		initialization();
		fp=new FlightsPage();
		lp=new LoginPage();
		hp=lp.Login(prop.getProperty("username"), prop.getProperty("password"));
		fp=hp.clickonFlightlink();
	}
	@Test
	public void bookAFlight()
	{
		fp.selecttrip();
		fp.selectPassengers(2);
		fp.selectDeparture("London");
		fp.selectDay("May");
		fp.selectDate(14);
		fp.selectToCity("Paris");
		fp.selectReturnMonth("June");
		fp.selectreturnDate(14);
		fp.selectServiceclass();
		fp.selectPreferences(2);
		fp.clickOnfindFlight();	
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
