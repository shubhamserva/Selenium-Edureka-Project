package com.tour.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tour.qa.mainbase.StartTest;
import com.tour.qa.pages.FlightsPage;
import com.tour.qa.pages.HomePage;
import com.tour.qa.pages.LoginPage;
import com.tour.qa.pages.SelectFlightPage;
import com.tour.qa.util.TestUtil;

public class SelectFlightPageTest extends StartTest {
	LoginPage lp;
	HomePage hp;
	FlightsPage fp;
	SelectFlightPage srp;
	TestUtil testutils;
	
	public SelectFlightPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		testutils=new TestUtil();
		fp=new FlightsPage();
		lp=new LoginPage();
		hp=lp.Login(prop.getProperty("username"), prop.getProperty("password"));
		fp=hp.clickonFlightlink();
		fp.selecttrip();
		fp.selectPassengers(2);
		fp.selectDeparture("Paris");
		fp.selectDay("May");
		fp.selectDate(13);
		fp.selectToCity("New York");
		fp.selectReturnMonth("June");
		fp.selectreturnDate(13);
		fp.selectServiceclass();
		fp.selectPreferences(2);
		fp.clickOnfindFlight();
	}
	@Test
	public void selectAFlightNo()
	{
		srp.selectFlight(2);
		srp.click_On_Continue();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	}
	


