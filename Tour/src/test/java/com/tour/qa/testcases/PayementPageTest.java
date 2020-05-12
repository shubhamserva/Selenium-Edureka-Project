package com.tour.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tour.qa.mainbase.StartTest;
import com.tour.qa.pages.FlightsPage;
import com.tour.qa.pages.HomePage;
import com.tour.qa.pages.LoginPage;
import com.tour.qa.pages.PayementPage;
import com.tour.qa.pages.SelectFlightPage;
import com.tour.qa.util.TestUtil;

public class PayementPageTest extends StartTest {
	LoginPage lp;
	HomePage hp;
	FlightsPage fp;
	SelectFlightPage srp;
	PayementPage pp;
	
	String sheetName="Payement";
	
	public PayementPageTest()
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
		
	}
	@DataProvider
	public Object[][] getTourTestData()
	{
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	@Test(dataProvider="getTourTestData")
	public void final_booking(String firstname,String lastname, String religion,String cards,int credit_card_no)
 
	{
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
		srp.selectFlight(2);
		srp.click_On_Continue();
		pp.passenger_FirstNames("Baba");
		pp.passenger_LastNames("Singh");
		pp.religion("Male");
		pp.cardDetails(1);
		pp.creditCardNumber(1234567890);
		pp.ExpiryDetailsDate(12);
		pp.ExpiryDetailsYear(2010);
		pp.passengerDetails("Baba");
		pp.passengerDetails2("Singh");
		pp.billing_addr("sf");
		pp.billing_state("Jaipur");
		pp.billing_postal(493838);
		pp.country_name(2);
		pp.delivery_addr("Ghar");
		pp.delivery_city("Jai");
		pp.delivery_state("NewYork");
		pp.delivery_postalcode(23323);
		pp.country_name_2(2);
		pp.buy_a_flight();
	}

}
